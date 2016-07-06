package org.omnidial.harvest;

public interface DialCandidateListener {
	
	public void onDialCandidate(DialCandidateHarvester h, DialCandidate dc);

	public void onHarvestCompletion(DialCandidateHarvester h, final int resultCount);

}
