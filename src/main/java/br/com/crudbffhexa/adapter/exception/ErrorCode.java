package br.com.crudbffhexa.adapter.exception;

public enum ErrorCode {
	
    // 400
    BAD_REQUEST("BAD_REQUEST", "Requisição inválida"),
    // 401
    UNAUTHORIZED("UNAUTHORIZED", "Não autorizado"),
    // 403
    FORBIDDEN("FORBIDDEN", "Acesso proibido"),
    // 404
    NOT_FOUND("NOT_FOUND", "Recurso não encontrado"),
    // 405
    METHOD_NOT_ALLOWED("METHOD_NOT_ALLOWED", "Método não permitido"),
    // 406
    NOT_ACCEPTABLE("NOT_ACCEPTABLE", "Não aceitável"),
    // 408
    REQUEST_TIMEOUT("REQUEST_TIMEOUT", "Tempo limite de requisição excedido"),
    // 415
    UNSUPPORTED_MEDIA_TYPE("UNSUPPORTED_MEDIA_TYPE", "Tipo de mídia não suportado"),
    // 422
    UNPROCESSABLE_ENTITY("UNPROCESSABLE_ENTITY", "Entidade não processável"),
    // 500
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR", "Erro interno do servidor"),
    // 501
    NOT_IMPLEMENTED("NOT_IMPLEMENTED", "Funcionalidade não implementada"),
    // 503
    SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE", "Serviço indisponível"),
    // 504
    GATEWAY_TIMEOUT("GATEWAY_TIMEOUT", "Tempo limite do gateway excedido"),
    // 505
    HTTP_VERSION_NOT_SUPPORTED("HTTP_VERSION_NOT_SUPPORTED", "Versão HTTP não suportada"),
	VALIDATION_ERROR("VALIDATION_ERROR", "Erro de Validacao"),
	VALIDATION_FORMAT("INVALID_FORMAT", "Formato Invalido"),
	DATA_NOT_FOUND("BAD_REQUEST", "Erro na validacao dos dados");
	//DATA_NOT_FOUND("NOT_FOUND", "Erro na validacao dos dados");


    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
    
    public static ErrorCode fromCode(String code) {
    	for(ErrorCode errorCode: ErrorCode.values()) {
    		if(errorCode.getCode().equals(code)) {
    			return errorCode;
    		}
    	}
    	return null;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
