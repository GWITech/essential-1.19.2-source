package gg.essential.lib.ice4j.ice.harvest;

import java.util.*;
import gg.essential.lib.ice4j.ice.*;

public interface CandidateHarvester
{
    Collection<LocalCandidate> harvest(final Component p0);
    
    HarvestStatistics getHarvestStatistics();
    
    boolean isHostHarvester();
}
