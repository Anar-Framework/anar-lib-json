package af.gov.anar.lib.json.exception;



public class JsonMappingException extends BaseCheckedException {
	private static final long serialVersionUID = 7464354673823721387L;

	public JsonMappingException(String errorCode, String errorMessage, Throwable rootCause) {
		super(errorCode, errorMessage, rootCause);

	}

}
