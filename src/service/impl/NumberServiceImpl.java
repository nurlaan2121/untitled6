package service.impl;

import service.NumberService;

public class NumberServiceImpl implements NumberService {
    @Override
    public void calculate() {
        System.out.println(10 / 2);
    }
}
