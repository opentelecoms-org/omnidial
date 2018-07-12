package org.omnidial.harvest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TelCandidateHarvesterTest implements DialCandidateListener {
	
			List<DialCandidate>	dcArray = new ArrayList<DialCandidate>();
			
	public void onDialCandidate(DialCandidateHarvester h, DialCandidate dc)
	{
			dcArray.add(dc);
	}
	public void onHarvestCompletion(DialCandidateHarvester h, final int resultCount)
	{
		
	}
	
	@Test
	public void test() {
		TelCandidateHarvesterTest t= new TelCandidateHarvesterTest();
		TelCandidateHarvester h = new TelCandidateHarvester();
		h.addListener(t);
		String number = "997180330";
		h.getCandidatesForNumber(number,"extra");
		assertEquals(1,t.dcArray.size());
		assertEquals(t.dcArray.get(0).address,number);
		
	}
	@Test
	public void test1() {
		TelCandidateHarvesterTest t1= new TelCandidateHarvesterTest();
		TelCandidateHarvester h1 = new TelCandidateHarvester();
		h1.addListener(t1);
		String number = "pranav";
		h1.getCandidatesForNumber(number,"extra");
		assertEquals(1, t1.dcArray.size());
		assertEquals(t1.dcArray.get(0).address, number);
		
	}
	@Test
	public void test2() {
		TelCandidateHarvesterTest t2= new TelCandidateHarvesterTest();
		TelCandidateHarvester h2 = new TelCandidateHarvester();
		h2.addListener(t2);
		String number = "9971pranav";
		h2.getCandidatesForNumber(number,"extra");
		assertEquals(1, t2.dcArray.size());
		assertEquals(t2.dcArray.get(0).address,number);
		
	}
	
	
	}
	


