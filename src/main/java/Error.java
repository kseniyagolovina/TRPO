
class Error {

    private int errorCode;
    private String errorMessage;
    private String errorPlace;
    private String resource;
    private int request_id;

    Error(int errorCode, String errorMessage, String errorPlace, String resource, int request_id) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorPlace = errorPlace;
        this.resource = resource;
        this.request_id = request_id;
    }
}

