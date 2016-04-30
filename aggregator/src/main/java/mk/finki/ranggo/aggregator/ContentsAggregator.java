package mk.finki.ranggo.aggregator;

import java.util.Date;

public interface ContentsAggregator {
	
	public void aggregateGoogleNewsRSSFeed(Date date) throws ContentsAggregatorException;
	
	public void aggregateHuffingtonPost() throws ContentsAggregatorException;
	
	public void aggregateTest() throws ContentsAggregatorException;
}