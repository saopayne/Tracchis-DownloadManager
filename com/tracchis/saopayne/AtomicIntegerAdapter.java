package com.tracchis.saopayne;


import java.util.concurrent.atomic.AtomicInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saopayne
 */
public class AtomicIntegerAdapter extends XmlAdapter<Integer, AtomicInteger> {

	@Override
	public Integer marshal(AtomicInteger v) throws Exception {
		return v.get();
	}

	@Override
	public AtomicInteger unmarshal(Integer v) throws Exception {
		return new AtomicInteger(v);
	}

}
