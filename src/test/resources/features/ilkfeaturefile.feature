Feature: ilk feature file

  @gp1
  Scenario: TC01_amazon_iphone_arama
    Given kullanici amazona gider
    When kullanici iphone icin arama yapar
    Then sayfa basliginin iphone icerdigini test eder

  Scenario: TC02_amazon_selenium_arama
    Given kullanici amazona gider
    When kullanici selenium icin arama yapar
    Then sayfa basliginin selenium icerdigini test eder

  Scenario: TC03_amazon_java_arama
    Given kullanici amazona gider
    When kullanici java icin arama yapar
    Then sayfa basliginin java icerdigini test eder

  Scenario: Sayfa kapanir
    Given sayfayi kapatir