package observer;

public class Follower implements Observer {
	private String followerName;
	
	public Follower(String followerName) {
		this.setFollowerName(followerName);
	}
	
	@Override
	public void update() {
		System.out.println("%s's channel has been updated");
	}

	public void play() {
		System.out.println("%s's channel is on live. ");
	}

	public String getFollowerName() {
		return followerName;
	}

	public void setFollowerName(String followerName) {
		this.followerName = followerName;
	}





}