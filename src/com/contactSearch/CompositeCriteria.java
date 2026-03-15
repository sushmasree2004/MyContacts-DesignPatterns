package com.contactSearch;
import com.contactManagement.Contact;

import java.util.List;
import java.util.function.Predicate;

public class CompositeCriteria implements SearchCriteria
{
	private List<SearchCriteria> criteriaList;

	public CompositeCriteria(List<SearchCriteria> criteriaList) 
	{
		this.criteriaList = criteriaList;
	}

	@Override
	public Predicate<Contact> toPredicate()
	{
		return criteriaList.stream()
				.map(SearchCriteria::toPredicate)
				.reduce(x -> true, Predicate::and);
	}
}
