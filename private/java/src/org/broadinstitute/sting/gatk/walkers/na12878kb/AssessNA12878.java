/*
*  By downloading the PROGRAM you agree to the following terms of use:
*  
*  BROAD INSTITUTE - SOFTWARE LICENSE AGREEMENT - FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
*  
*  This Agreement is made between the Broad Institute, Inc. with a principal address at 7 Cambridge Center, Cambridge, MA 02142 (BROAD) and the LICENSEE and is effective at the date the downloading is completed (EFFECTIVE DATE).
*  
*  WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
*  WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
*  NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
*  
*  1. DEFINITIONS
*  1.1 PROGRAM shall mean copyright in the object code and source code known as GATK2 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute/GATK on the EFFECTIVE DATE.
*  
*  2. LICENSE
*  2.1   Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM. 
*  The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only.  For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
*  2.2  No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD.  LICENSEE shall ensure that all of its users agree to the terms of this Agreement.  LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
*  2.3  License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.  
*  
*  3. OWNERSHIP OF INTELLECTUAL PROPERTY 
*  LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies.  LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
*  Copyright 2012 Broad Institute, Inc.
*  Notice of attribution:  The GATK2 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
*  LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
*  
*  4. INDEMNIFICATION
*  LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
*  
*  5. NO REPRESENTATIONS OR WARRANTIES
*  THE PROGRAM IS DELIVERED AS IS.  BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
*  IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
*  
*  6. ASSIGNMENT
*  This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
*  
*  7. MISCELLANEOUS
*  7.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
*  7.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
*  7.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
*  7.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested.  All notices under this Agreement shall be deemed effective upon receipt. 
*  7.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter. 
*  7.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
*  7.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/

package org.broadinstitute.sting.gatk.walkers.na12878kb;

import net.sf.samtools.SAMFileReader;
import net.sf.samtools.SAMRecord;
import net.sf.samtools.SAMRecordIterator;
import org.broadinstitute.sting.commandline.*;
import org.broadinstitute.sting.gatk.contexts.AlignmentContext;
import org.broadinstitute.sting.gatk.contexts.ReferenceContext;
import org.broadinstitute.sting.gatk.refdata.RefMetaDataTracker;
import org.broadinstitute.sting.gatk.report.GATKReport;
import org.broadinstitute.sting.gatk.walkers.na12878kb.core.MongoVariantContext;
import org.broadinstitute.sting.gatk.walkers.na12878kb.core.NA12878DBArgumentCollection;
import org.broadinstitute.sting.gatk.walkers.na12878kb.core.SiteIterator;
import org.broadinstitute.sting.utils.GenomeLoc;
import org.broadinstitute.sting.utils.Utils;
import org.broadinstitute.sting.utils.variant.GATKVCFUtils;
import org.broadinstitute.variant.vcf.*;
import org.broadinstitute.variant.variantcontext.VariantContext;
import org.broadinstitute.variant.variantcontext.VariantContextBuilder;
import org.broadinstitute.variant.variantcontext.writer.VariantContextWriter;

import java.io.File;
import java.io.PrintStream;
import java.util.*;

/**
 * Assess the quality of an NA12878 callset against the NA12878 knowledge base
 *
 * <p>
 *     This walker takes a single VCF file contains calls of any type (SNPs, Indels)
 *     using at least the sample NA12878 (i.e., the VCF must contain the sample NA12878)
 *     and provides an itemized summary of the different types of true positives, false positives
 *     and false negatives in the input callset relative to the NA12878 knowledge base.
 * </p>Additionally, writes out a bad sites VCF that contains the following data by default: calls at known
 *     false positives, calls in NA12878 known to be monomorphic, sites that are TP but are
 *     either called but filtered out or not called at all, and finally calls in the input
 *     VCF not in the DB at all or in the DB with unknown status.  This VCF contains INFO field
 *     key/value pairs describing why the site was included (i.e., it is a false negative).
 * </p>
 *
 * See http://gatkforums.broadinstitute.org/discussion/1848/using-the-na12878-knowledge-base for more information.
 *
 * @author depristo
 * @since 11/2012
 * @version 0.1
 */
public class AssessNA12878 extends NA12878DBWalker {
    /**
     * Variants from these VCF files are used by this tool as input.
     * The files must at least contain the standard VCF header lines, but
     * can be empty (i.e., no variants are contained in the file).
     */
    @Input(fullName="variant", shortName = "V", doc="Input VCF file", required=true)
    public List<RodBinding<VariantContext>> variants;

    @Input(fullName="BAM", shortName = "BAM", doc="Input BAM file.  If provided, we will differentiate false negative sites into those truly missed and those without coverage", required=false)
    public File BAM = null;

    @Output(doc="Summary GATKReport will be written here")
    public PrintStream out;

    @Argument(fullName="excludeCallset", shortName = "excludeCallset", doc="Don't count calls that come from only these excluded callsets", required=false)
    public Set<String> excludeCallset = null;

    /**
     * An output VCF file containing the bad sites (FN/FP) that were found in the input callset w.r.t. the current NA12878 knowledge base
     */
    @Output(fullName = "badSites", shortName = "badSites", doc="VCF file containing information on FP/FNs in the input callset", required=false)
    public VariantContextWriter badSites = null;

    @Argument(fullName="maxToWrite", shortName = "maxToWrite", doc="Max. number of bad sites to write out", required=false)
    public int maxToWrite = 10000;

    @Argument(fullName="minDepthForLowCoverage", shortName = "minDepthForLowCoverage", doc="A false negative will be flagged as due to low coverage if the (optional) BAM is provided and the coverage overlapping the site is less than this value", required=false)
    public int minDepthForLowCoverage = 5;

    @Argument(fullName="typesToInclude", shortName = "typesToInclude", doc="Should we analyze SNPs, INDELs, or both?", required=false)
    public TypesToInclude typesToInclude = TypesToInclude.BOTH;

    public enum TypesToInclude {
        SNPS,
        INDELS,
        BOTH
    }

    /**
     * Useful when some state isn't interesting as a bad site but is extremely prevalent in the input callset
     */
    @Argument(fullName="AssessmentsToExclude", shortName = "AssessmentsToExclude", doc="If provided, we will prevent any of these states from being written out to the badSites VCF.", required=false)
    public Set<AssessmentType> AssessmentsToExclude = EnumSet.noneOf(AssessmentType.class);

    @Hidden
    @Argument(shortName = "debug", required=false)
    protected boolean debug = false;

    SiteIterator<MongoVariantContext> consensusSiteIterator;
    boolean captureBadSites = true;
    int nWritten = 0;

    public enum AssessmentType {
        TRUE_POSITIVE(false),
        CORRECTLY_FILTERED(false),
        CORRECTLY_UNCALLED(false),
        REASONABLE_FILTERS_WOULD_FILTER_FP_SITE(false),
        FALSE_POSITIVE_SITE_IS_FP(true),
        FALSE_POSITIVE_MONO_IN_NA12878(true),
        FALSE_NEGATIVE_CALLED_BUT_FILTERED(true),
        FALSE_NEGATIVE_NOT_CALLED_BUT_LOW_COVERAGE(false),
        FALSE_NEGATIVE_NOT_CALLED_AT_ALL(true),
        CALLED_IN_DB_UNKNOWN_STATUS(true),
        CALLED_NOT_IN_DB_AT_ALL(true),
        NOT_RELEVANT(false);

        private final boolean interesting;

        private AssessmentType(boolean interesting) {
            this.interesting = interesting;
        }
    }

    private class Assessment {
        final EnumMap<AssessmentType, Integer> counts;

        public Assessment() {
            counts = new EnumMap<AssessmentType, Integer>(AssessmentType.class);
            for ( final AssessmentType type : AssessmentType.values() )
                counts.put(type, 0);
        }

        public final void inc(final AssessmentType type) {
            counts.put(type, counts.get(type) + 1);
        }

        public final int get(final AssessmentType type) {
            return counts.get(type);
        }

        public List<Integer> getCounts() {
            final List<Integer> returnList = new ArrayList<Integer>();
            for( final AssessmentType type : AssessmentType.values() ) {
                returnList.add(get(type));
            }
            return returnList;
        }
    }

    final Map<String,Assessment> SNPAssessments = new HashMap<String,Assessment>();
    final Map<String,Assessment> IndelAssessments = new HashMap<String,Assessment>();
    SAMFileReader bamReader = null;

    @Override
    public NA12878DBArgumentCollection.DBType getDefaultDB() {
        return NA12878DBArgumentCollection.DBType.PRODUCTION;
    }

    public void initialize() {
        super.initialize();
        consensusSiteIterator = db.getConsensusSites(makeSiteSelector());
        captureBadSites = badSites != null;

        if( captureBadSites ) {
            final Set<VCFHeaderLine> lines = GATKVCFUtils.getHeaderFields(getToolkit());
            lines.add(new VCFInfoHeaderLine("WHY", 1, VCFHeaderLineType.String, "Why was the site considered bad"));
            lines.add(new VCFInfoHeaderLine("SupportingCallsets", 1, VCFHeaderLineType.String, "Callsets supporting the consensus, where available"));
            lines.addAll(MongoVariantContext.reviewHeaderLines());
            badSites.writeHeader(new VCFHeader(lines, Collections.singleton("NA12878")));
        }

        if ( BAM != null ) {
            bamReader = new SAMFileReader(BAM);
        }
    }

    @Override
    public Integer map(RefMetaDataTracker tracker, ReferenceContext ref, AlignmentContext context) {
        if ( tracker == null ) return 0;

        if ( debug ) logger.info("Processing " + context.getLocation());
        includeMissingCalls(consensusSiteIterator, context.getLocation());
        final List<MongoVariantContext> consensusSites = consensusSiteIterator.getSitesAtLocation(context.getLocation());

        for ( final RodBinding<VariantContext> rod : variants ) {
            if( tracker.getValues(rod, ref.getLocus()).size() == 0 ) {
                // missed consensus site(s)
                for ( final MongoVariantContext site : consensusSites ) {
                    accessSite(rod.getName(), null, site);
                }
            } else {
                for( final VariantContext vcRaw : tracker.getValues(rod, ref.getLocus()) ) {
                    final VariantContext vc = vcRaw.subContextFromSample("NA12878");

                    if ( ! vc.isBiallelic() ) {
                        logger.info("Skipping unsupported multi-allelic variant " + vc);
                        continue;
                    }

                    accessSite(rod.getName(), vc, findMatching(vc, consensusSites)); // BUGBUG: Should this be called for not only the matching consensusSite but for all consensusSites?
                }
            }
        }

        return 1;
    }

    final MongoVariantContext findMatching(final VariantContext vc, final Collection<MongoVariantContext> consensusSites ) {
        for ( final MongoVariantContext site : consensusSites )
            if ( site.matches(vc) )
                return site;
        return null;
    }

    private void includeMissingCalls(final SiteIterator<MongoVariantContext> siteIterator, final GenomeLoc loc) {
        includeMissingCalls(siteIterator.getSitesBefore(loc));
    }

    private void includeMissingCalls(final List<MongoVariantContext> missedSites) {
        for ( final MongoVariantContext missedSite : missedSites ) {
            logger.info("Missed site " + missedSite);
            for ( final RodBinding<VariantContext> rod : variants ) {
                accessSite(rod.getName(), null, missedSite);
            }
        }
    }

    /**
     * Should we include the variant vc in our assessment?
     *
     * @param vc a VariantContext to potentially include
     * @return true if VC should be included, false otherwise
     */
    private boolean includeVariant(final VariantContext vc) {
        switch ( typesToInclude ) {
            case BOTH: return true;
            case SNPS: return vc.isSNP();
            case INDELS: return ! vc.isSNP();
            default:
                throw new IllegalStateException("Unexpected enum " + typesToInclude);
        }
    }

    private void accessSite(final String rodName, final VariantContext call, final MongoVariantContext consensusSite) {

        final VariantContext vc = call != null ? call : consensusSite.getVariantContext();

        if ( ! includeVariant(vc) )
            return;

        final AssessmentType type = figureOutAssessmentType(call, consensusSite);
        final Map<String,Assessment> assessmentMap = vc.isSNP() ? SNPAssessments : IndelAssessments;
        Assessment assessment = assessmentMap.get(rodName);
        if(assessment == null) {
            assessment = new Assessment();
            assessmentMap.put(rodName, assessment);
        }
        assessment.inc(type);

        if ( captureBadSites && type.interesting && ! AssessmentsToExclude.contains(type) && nWritten++ < maxToWrite) {
            final VariantContextBuilder builder = new VariantContextBuilder(vc);
            if ( consensusSite != null )
                builder.attribute("SupportingCallsets", Utils.join(",", consensusSite.getSupportingCallSets()));
            builder.attribute("WHY", type.toString());
            badSites.add(builder.make());
            logger.info("Accessed site " + call + " consensus " + consensusSite);
        }
    }

    private AssessmentType figureOutAssessmentType(final VariantContext call, final MongoVariantContext consensusSite) {
        final boolean consensusTP = consensusSite != null && !isExcluded(consensusSite) && consensusSite.getType().isTruePositive() && consensusSite.getPolymorphicStatus().isPolymorphic();
        final boolean consensusFP = consensusSite != null && !isExcluded(consensusSite) && consensusSite.getType().isFalsePositive();

        if ( call != null ) {
            if ( consensusTP ) {
                return call.isFiltered()
                        ? AssessmentType.FALSE_NEGATIVE_CALLED_BUT_FILTERED
                        : AssessmentType.TRUE_POSITIVE;
            } else if (consensusSite != null && consensusSite.getType().isTruePositive() && consensusSite.getPolymorphicStatus().isMonomorphic() ) {
                return AssessmentType.FALSE_POSITIVE_MONO_IN_NA12878;
            } else if ( consensusFP ) {
                if ( call.isFiltered() )
                    return AssessmentType.CORRECTLY_FILTERED;
                else if ( likelyWouldBeFiltered(call) )
                    return AssessmentType.REASONABLE_FILTERS_WOULD_FILTER_FP_SITE;
                else
                    return AssessmentType.FALSE_POSITIVE_SITE_IS_FP;
            } else if ( consensusSite != null && consensusSite.getType().isUnknown() ) {
                return AssessmentType.CALLED_IN_DB_UNKNOWN_STATUS;
            } else if ( consensusSite == null && call.isNotFiltered() ) {
                return AssessmentType.CALLED_NOT_IN_DB_AT_ALL;
            } else {
                return AssessmentType.NOT_RELEVANT;
            }
        } else if ( consensusTP ) { // call == null
            if ( BAM != null ) {
                return sufficientDepthToCall(consensusSite)
                        ? AssessmentType.FALSE_NEGATIVE_NOT_CALLED_AT_ALL
                        : AssessmentType.FALSE_NEGATIVE_NOT_CALLED_BUT_LOW_COVERAGE;
            } else {
                return AssessmentType.FALSE_NEGATIVE_NOT_CALLED_AT_ALL;
            }
        } else if (consensusFP ) { // call == null
            return AssessmentType.CORRECTLY_UNCALLED;
        } else {
            return AssessmentType.NOT_RELEVANT;
        }
    }

    private boolean isExcluded( final MongoVariantContext consensusSite ) {
        return excludeCallset != null && excludeCallset.containsAll(consensusSite.getSupportingCallSets());
    }

    /**
     * If a BAM is provided, assess whether there's sufficient coverage to call the site
     *
     * @param falseNegative a site that was missed in the call set
     * @return true if there's enough coverage at the site in the BAM to likely make a call
     */
    private boolean sufficientDepthToCall(final MongoVariantContext falseNegative) {
        final SAMRecordIterator it = bamReader.queryOverlapping(falseNegative.getChr(), falseNegative.getStart(), falseNegative.getStart());

        int depth = 0;
        while ( it.hasNext() && depth < minDepthForLowCoverage ) {
            final SAMRecord read = it.next();
            // TODO -- filter for MAPQ?
            depth++;
        }
        it.close();

        return depth >= minDepthForLowCoverage;
    }

    /**
     * Returns true is a simple set of reasonable filters would likely remove it
     *
     * For SNPs:
     * QD < 2.0
     * MQ < 40.0
     * FS > 60.0
     * HaplotypeScore > 13.0
     * MQRankSum < -12.5
     * ReadPosRankSum < -8.0
     *
     * For indels:
     *
     * QD < 2.0
     * ReadPosRankSum < -20.0
     * InbreedingCoeff < -0.8
     * FS > 200.0
     *
     * @param vc
     * @return
     */
    public boolean likelyWouldBeFiltered(final VariantContext vc) {
        final double FS = vc.getAttributeAsDouble("FS", 0.0);
        final double QD = vc.getAttributeAsDouble("QD", 20.0);
        final double MQ = vc.getAttributeAsDouble("MQ", 50.0);

        if ( vc.isSNP() ) {
            return FS > 60 || QD < 2 || MQ < 40;
        } else {
            return FS > 200 || QD < 2;
        }
    }

    public void onTraversalDone(Integer result) {
        super.onTraversalDone(result);
        includeMissingCalls(consensusSiteIterator.toList());

        if( variants.size() == 1 ) {
            final GATKReport report = GATKReport.newSimpleReportWithDescription("NA12878Assessment", "Evaluation of input variant callsets",
                    "Name", "VariantType", "AssessmentType", "Count");
            for( final RodBinding rod : variants ) {
                // snps
                for ( final AssessmentType type : AssessmentType.values() ) {
                    final Assessment assessment = SNPAssessments.get(rod.getName());
                    if ( assessment != null )
                        report.addRow(rod.getName(), "SNP", type, assessment.get(type));
                }

                // indels
                for ( final AssessmentType type : AssessmentType.values() ) {
                    final Assessment assessment = IndelAssessments.get(rod.getName());
                    if ( assessment != null )
                        report.addRow(rod.getName(), "Indel", type, assessment.get(type));
                }
            }
            report.print(out);
        } else {
            final List<String> columns = new ArrayList<String>();
            columns.add("Name");
            columns.add("VariantType");
            for( final AssessmentType type : AssessmentType.values() ) {
                columns.add(type.toString());
            }
            final GATKReport report = GATKReport.newSimpleReport("NA12878Assessment", columns);
            for( final RodBinding rod : variants ) {
                final List<Object> row = new ArrayList<Object>();

                // snps
                if ( SNPAssessments.containsKey(rod.getName()) ) {
                    row.add(rod.getName());
                    row.add("SNP");
                    row.addAll(SNPAssessments.get(rod.getName()).getCounts());
                    report.addRowList(row);
                    row.clear();
                }

                // indels
                if ( IndelAssessments.containsKey(rod.getName()) ) {
                    row.add(rod.getName());
                    row.add("indel");
                    row.addAll(IndelAssessments.get(rod.getName()).getCounts());
                    report.addRowList(row);
                }
            }
            report.print(out);
        }
    }
}