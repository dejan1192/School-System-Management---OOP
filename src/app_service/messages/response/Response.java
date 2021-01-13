package app_service.messages.response;

public class Response {

    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "Response{" +
                "success=" + success +
                '}';
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
