package basic;

public class SpiderMan {
	boolean isSpider;
	Spider spider;
	
	public SpiderMan()
	{
		this.spider = new Spider();
	}
	void fireWeb() {
		if(isSpider)
		{
			spider.fireWeb();
		}
		else System.out.println("난 거미가 아냐");
	}
	
	void jump()
	{
		System.out.println("폴짝");
	}


}
