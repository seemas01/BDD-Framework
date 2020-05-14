Feature: AUH service validation

  #Scenario: Testing using test data
   # Given login to analyst hub using "TC_01"
   # When we select a issuer
   # Then status code is "200"
   # And xyz

  @Single
  Scenario: Test single
    Given login to analyst hub using "29003272"
    Then status code is "200"
    And xyz

  @ID
  Scenario Outline: Test outline using ID
    Given login to analyst hub using "<ID>"
    Then status code is OK
    And xyz
    Examples:
    |ID|
    |29003272|


  @URI
  Scenario Outline: Test outline for uri
    Given service "<URI>" is launched
    Then status code is OK
    And xyz
    Examples:
      |URI|
      |http://ftc-lbdkrapp204.ad.moodys.net:4211/aop/analyst/29003272/issuers|

  Scenario Outline: Test outline for uri and analyst ID
    Given service "<URI>" is launched for analyst "<AnalystID>"
    Then status code is OK
    And xyz
    Examples:
      |URI|AnalystID|
      |http://ftc-lbdkrapp204.ad.moodys.net:4211/aop/analyst/|29003272/issuers|

