package com.cdac.gist.ocp.after.refactoring;

import java.util.ArrayList;
import java.util.List;

public class PricingCalculator implements IPricingCalculator{

	private List<IPriceRule> _pricingRules;
	public PricingCalculator() {
		_pricingRules=new ArrayList<>();
		_pricingRules.add(new EachPriceRule());
		_pricingRules.add(new PerGramPriceRule());
		_pricingRules.add(new SpecialPriceRule());
	}
	@Override
	public double calculatePrice(OrderItem orderItem) {
		for(IPriceRule ipriceRule : _pricingRules){
			if(ipriceRule.isMatch(orderItem)){
				return ipriceRule.calculatePrice(orderItem);
				
			}
		}
		return 0.0;
	}

}
