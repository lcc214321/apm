package com.peaceful.apm.core;

import org.perf4j.TimingStatistics;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangjun on 16/9/15.
 */
public interface MetricStore {

    void saveStatisticsData(Map<String, TimingStatistics> timingStatisticsMap, long interval, TimeUnit timeUnit);

   // void saveCountData();

}
