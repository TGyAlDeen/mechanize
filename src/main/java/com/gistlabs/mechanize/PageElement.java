/**
 * Copyright (C) 2012 Gist Labs, LLC. (http://gistlabs.com)
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.gistlabs.mechanize;

import org.jsoup.nodes.Element;

/**
 * @author Martin Kersten<Martin.Kersten.mk@gmail.com>
 * @version 1.0
 * @since 2012-09-12
 */
public abstract class PageElement implements RequestBuilderFactory {
	protected final Page page;
	protected final Element element;
	
	public PageElement(Page page, Element element) {
		this.page = page;
		this.element = element;
	}

	protected Element getElement() {
		return element;
	}
	
	public Page getPage() {
		return page;
	}
	
	public boolean hasAttribute(String attributeName) {
		return element.hasAttr(attributeName);
	}
	
	public String getAttribute(String attributeName) {
		return element.attr(attributeName);
	}
	
	@Override
	public RequestBuilder doRequest(String uri) {
		return getPage().doRequest(uri);
	}
	
	public boolean hasAttribute(String key) {
		return element.hasAttr(key);
	}
	
	public String getAttribute(String key) {
		return element.attr(key);
	}
}
