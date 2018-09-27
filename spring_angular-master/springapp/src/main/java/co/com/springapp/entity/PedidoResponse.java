package co.com.springapp.entity;

public class PedidoResponse {

	/** Varible que define si el consumo fué o no exitoso. */
	private Boolean success;

	/**
	 * Variable para almacenar un mensaje lanzado en la respuesta del consumo del
	 * servicio.
	 */
	private String msg;

	/** Exepción lanzada al consumir el servicio. */
	private String exception;

	/**
	 * Variable que define un código de exepción lanzado al consumir el servicio.
	 */
	private Integer exceptionCode;

	/**
	 * Constructor de la clase.
	 */
	public PedidoResponse() {
	}

	/**
	 * @return the success
	 */
	public Boolean getSuccess() {
		return success;
	}

	/**
	 * @param success
	 *            the success to set
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg
	 *            the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the exception
	 */
	public String getException() {
		return exception;
	}

	/**
	 * @param exception
	 *            the exception to set
	 */
	public void setException(String exception) {
		this.exception = exception;
	}

	/**
	 * @return the exceptionCode
	 */
	public Integer getExceptionCode() {
		return exceptionCode;
	}

	/**
	 * @param exceptionCode
	 *            the exceptionCode to set
	 */
	public void setExceptionCode(Integer exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

}
