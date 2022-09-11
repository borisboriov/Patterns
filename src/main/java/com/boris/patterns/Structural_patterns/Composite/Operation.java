package com.boris.patterns.Structural_patterns.Composite;

public interface Operation {
    // выполнить одиночную или композитную операцию
    void perform();
    // браузер структуры
    String getExplanation();
}