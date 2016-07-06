/*
 * Copyright 2016 Daniel Pocock
 *
 */

package org.omnidial.harvest;

public class ENUMResult {
	private String protocol;
	private String result;
	public ENUMResult(String protocol, String result) {
		this.protocol = protocol;
		this.result = result;
	}
	public String getProtocol() {
		return protocol;
	}
	public String getResult() {
		return result;
	}
}
