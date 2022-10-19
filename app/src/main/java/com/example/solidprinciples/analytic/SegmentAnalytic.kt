package com.example.solidprinciples.analytic

class SegmentAnalytic : AnalyticProvider {
    override fun track(data: Any) {
        println("SegmentAnalytic sending $data")
    }
}