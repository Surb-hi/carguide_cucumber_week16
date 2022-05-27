$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cardeals.feature");
formatter.feature({
  "line": 2,
  "name": "Search functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.before({
  "duration": 7889717700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search the dealer name",
  "description": "",
  "id": "search-functionality;search-the-dealer-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on “buy+sell” tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click \u0027Find a Dealer\u0027 link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I see the dealer lists",
  "rows": [
    {
      "cells": [
        "1st Choice Car City"
      ],
      "line": 9
    },
    {
      "cells": [
        "4th Ave Motor Co."
      ],
      "line": 10
    },
    {
      "cells": [
        "AUS Vehicle Sales - Bassendean"
      ],
      "line": 11
    },
    {
      "cells": [
        "Adelaide City Automotive Group"
      ],
      "line": 12
    },
    {
      "cells": [
        "Affordable Cars Wangara"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SerachCar.iAmOnHomepage()"
});
formatter.result({
  "duration": 91442900,
  "status": "passed"
});
formatter.match({
  "location": "SerachCar.iMouseHoverOnBuySellTab()"
});
formatter.result({
  "duration": 187364000,
  "status": "passed"
});
formatter.match({
  "location": "Cardealer.iClickFindADealerLink()"
});
formatter.result({
  "duration": 1977923800,
  "status": "passed"
});
formatter.match({
  "location": "Cardealer.iSeeTheDealerLists(DataTable)"
});
formatter.result({
  "duration": 14896915800,
  "status": "passed"
});
formatter.after({
  "duration": 995664400,
  "status": "passed"
});
});