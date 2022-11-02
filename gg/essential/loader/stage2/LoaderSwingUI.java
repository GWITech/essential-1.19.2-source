package gg.essential.loader.stage2;

import gg.essential.loader.stage2.components.*;
import javax.swing.plaf.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class LoaderSwingUI implements LoaderUI, EssentialStyle
{
    private static final Rectangle PROGRESS_BOUNDS;
    private JFrame frame;
    private JProgressBar progressBar;
    
    public LoaderSwingUI() {
        super();
    }
    
    @Override
    public void start() {
        this.initFrame();
    }
    
    @Override
    public void setDownloadSize(final int bytes) {
        this.progressBar.setMaximum(bytes);
    }
    
    @Override
    public void setDownloaded(final int bytes) {
        this.progressBar.setValue(bytes);
    }
    
    @Override
    public void complete() {
        this.progressBar.setValue(this.progressBar.getMaximum());
        try {
            Thread.sleep(500L);
        }
        catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.frame.enableInputMethods(false);
        this.frame.dispose();
    }
    
    private void initFrame() {
        final JFrame frame = this.makeFrame(Window::dispose);
        final Container contentPane = this.makeContentWithLogo(frame);
        final JProgressBar progressBar = new JProgressBar();
        progressBar.setForeground(LoaderSwingUI.COLOR_PROGRESS_FILL);
        progressBar.setBackground(LoaderSwingUI.COLOR_OUTLINE);
        progressBar.setUI(new EssentialProgressBarUI());
        progressBar.setBorderPainted(false);
        progressBar.setBounds(LoaderSwingUI.PROGRESS_BOUNDS);
        final JLabel taskLabel = new JLabel("Updating...", 2);
        taskLabel.setBorder(new EmptyBorder(0, 12, 0, 0));
        taskLabel.setForeground(Color.BLACK);
        taskLabel.setAlignmentX(0.0f);
        if (Fonts.semiBold != null) {
            taskLabel.setFont(Fonts.semiBold.deriveFont(15.0f));
        }
        taskLabel.setBounds(LoaderSwingUI.PROGRESS_BOUNDS);
        progressBar.getModel().addChangeListener(e -> {
            final String label = (progressBar.getValue() < progressBar.getMaximum()) ? "Updating..." : "Completed.";
            if (!taskLabel.getText().equals(label)) {
                taskLabel.setText(label);
            }
            return;
        });
        final JLayeredPane progressBarLayers = new JLayeredPane();
        progressBarLayers.setPreferredSize(LoaderSwingUI.PROGRESS_BOUNDS.getSize());
        progressBarLayers.add(progressBar, 0, 0);
        progressBarLayers.add(taskLabel, 1, 0);
        final JPanel progressBarPanel = new JPanel(new GridLayout());
        progressBarPanel.setBackground(LoaderSwingUI.COLOR_BACKGROUND);
        progressBarPanel.setBorder(new EmptyBorder(0, 10, 10, 10));
        progressBarPanel.add(progressBarLayers);
        contentPane.add(progressBarPanel);
        frame.pack();
        frame.setVisible(true);
        this.frame = frame;
        this.progressBar = progressBar;
    }
    
    public static void main(final String[] args) throws InterruptedException {
        final LoaderSwingUI ui = new LoaderSwingUI();
        ui.start();
        ui.setDownloadSize(1000);
        while (ui.frame.isDisplayable()) {
            for (int i = 0; i < 1000; i += 4) {
                ui.setDownloaded(i);
                Thread.sleep(16L);
            }
            ui.setDownloaded(1000);
            Thread.sleep(500L);
        }
    }
    
    private static /* synthetic */ void lambda$initFrame$0(final JProgressBar progressBar, final JLabel taskLabel, final ChangeEvent e) {
        final String label = (progressBar.getValue() < progressBar.getMaximum()) ? "Updating..." : "Completed.";
        if (!taskLabel.getText().equals(label)) {
            taskLabel.setText(label);
        }
    }
    
    static {
        PROGRESS_BOUNDS = new Rectangle(0, 0, 249, 35);
    }
}
