package command;

public class Clicker implements DeviceActions{
	
	private int pageNum = 1;

	@Override
	public void start() {
		this.pageNum = 1;
		System.out.println("Now at slide " + pageNum);
	}

	@Override
	public void pause() {
		System.out.println("Paused at slide " + pageNum);
	}

	@Override
	public void nextSlide() {
		pageNum++;
		System.out.println("Now at slide " + pageNum);
	}

	@Override
	public void prevSlide() {
		pageNum--;
		System.out.println("Now at slide " + pageNum);
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

}
