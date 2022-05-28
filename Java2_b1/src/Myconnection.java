
public class Myconnection {
	String ip;
	String port;

	public Myconnection() {
		// TODO Auto-generated constructor stub
	}

	public Myconnection(String ip, String port) {

		this.ip = ip;
		this.port = port;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}

	public void connecToSever() throws SeverException {
		if (ip.equals("127.10.10.1") && port.equals("1234")) {
			System.out.println("connecting to Sever ... ");
		} else {
			throw new SeverException();

		}

	}

	public static void main(String[] args)  {
		Myconnection o = new Myconnection("127.10.10.1", "134");
		try {
			o.connecToSever();
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
}
