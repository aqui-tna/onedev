package com.pmease.gitop.web.page.project.source;

import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.pmease.gitop.web.page.project.ProjectCategoryPage;

@SuppressWarnings("serial")
public class RepositoryCommitsPage extends ProjectCategoryPage {

	public RepositoryCommitsPage(PageParameters params) {
		super(params);
	}

	@Override
	protected Category getCategory() {
		return Category.COMMITS;
	}

	@Override
	protected String getPageTitle() {
		return getProject() + " - commits";
	}

}
