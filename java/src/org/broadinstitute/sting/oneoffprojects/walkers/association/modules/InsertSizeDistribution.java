package org.broadinstitute.sting.oneoffprojects.walkers.association.modules;

import org.broadinstitute.sting.oneoffprojects.walkers.association.statistics.casecontrol.TStatistic;
import org.broadinstitute.sting.oneoffprojects.walkers.association.statistics.casecontrol.UStatistic;
import org.broadinstitute.sting.utils.pileup.PileupElement;
import org.broadinstitute.sting.utils.pileup.ReadBackedPileup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author chartl
 */
public class InsertSizeDistribution extends TStatistic {
    public int getWindowSize() { return 200; }
    public int slideByValue() { return 25; }
    public boolean usePreviouslySeenReads() { return false; }

    public Collection<Number> map(ReadBackedPileup pileup) {
        List<Integer> insertSizes = new ArrayList<Integer>(pileup.size());
        for ( PileupElement e : pileup ) {
            insertSizes.add(e.getRead().getInferredInsertSize());
        }

        return (Collection) insertSizes;
    }

}
