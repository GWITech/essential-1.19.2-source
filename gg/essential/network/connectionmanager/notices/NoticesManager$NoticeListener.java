package gg.essential.network.connectionmanager.notices;

import gg.essential.notices.model.*;

interface NoticeListener
{
    void noticeAdded(final Notice p0);
    
    void noticeRemoved(final Notice p0);
    
    void onConnect();
    
    default void resetState() {
    }
}
