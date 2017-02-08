/**
 * 
 */
package com.emar.yiqifa.demo.service.impl;

import com.emar.yiqifa.demo.DemoService;

/**
 * @author houyefeng
 *
 */
public class DemoServiceImpl implements DemoService {

	/* (non-Javadoc)
	 * @see com.emar.yiqifa.demo.DemoService#sayHello(java.lang.String)
	 */
	@Override
	public String sayHello(String to) {
		return "Hello " + to + "!";
	}

}
