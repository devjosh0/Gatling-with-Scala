var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "8",
        "ok": "8",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "226",
        "ok": "226",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "651",
        "ok": "651",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "438",
        "ok": "438",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "212",
        "ok": "212",
        "ko": "-"
    },
    "percentiles1": {
        "total": "438",
        "ok": "438",
        "ko": "-"
    },
    "percentiles2": {
        "total": "651",
        "ok": "651",
        "ko": "-"
    },
    "percentiles3": {
        "total": "651",
        "ok": "651",
        "ko": "-"
    },
    "percentiles4": {
        "total": "651",
        "ok": "651",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 8,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "4",
        "ok": "4",
        "ko": "-"
    }
},
contents: {
"req_goto-ae8fa": {
        type: "REQUEST",
        name: "Goto",
path: "Goto",
pathFormatted: "req_goto-ae8fa",
stats: {
    "name": "Goto",
    "numberOfRequests": {
        "total": "4",
        "ok": "4",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "650",
        "ok": "650",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "651",
        "ok": "651",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "651",
        "ok": "651",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "percentiles1": {
        "total": "651",
        "ok": "651",
        "ko": "-"
    },
    "percentiles2": {
        "total": "651",
        "ok": "651",
        "ko": "-"
    },
    "percentiles3": {
        "total": "651",
        "ok": "651",
        "ko": "-"
    },
    "percentiles4": {
        "total": "651",
        "ok": "651",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 4,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    }
}
    },"req_goto-redirect-1-bd2cd": {
        type: "REQUEST",
        name: "Goto Redirect 1",
path: "Goto Redirect 1",
pathFormatted: "req_goto-redirect-1-bd2cd",
stats: {
    "name": "Goto Redirect 1",
    "numberOfRequests": {
        "total": "4",
        "ok": "4",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "226",
        "ok": "226",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "226",
        "ok": "226",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "226",
        "ok": "226",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "percentiles1": {
        "total": "226",
        "ok": "226",
        "ko": "-"
    },
    "percentiles2": {
        "total": "226",
        "ok": "226",
        "ko": "-"
    },
    "percentiles3": {
        "total": "226",
        "ok": "226",
        "ko": "-"
    },
    "percentiles4": {
        "total": "226",
        "ok": "226",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 4,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
