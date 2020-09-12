package kr.ac.hansung.exception;

public class UserDuplicatedException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1423927509700993968L;
	private String username;
	
	public UserDuplicatedException(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	
}
