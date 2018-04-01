package com.xujc.Common;



public class ResultGenerator {
	 private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
	    private static final String DEFAULT_FAIL_MESSAGE = "FAIL";

	    public static Result genSuccessResult() {
	        Result result = new Result();
	        result.setResultCode(Constants.RESULT_CODE_SUCCESS);
	        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
	        return result;
	    }

	    public static Result genSuccessResult(Object data,String updatemessage,String addmessage,String delemessage,String getmessage) {
	        Result result = new Result();
	        result.setResultCode(Constants.RESULT_CODE_SUCCESS);
	        result.setMessage(updatemessage+addmessage+delemessage+getmessage);
	        result.setData(data);
	        return result;
	    }
	    
	    public static Result genSuccessResult(Object data) {
	        Result result = new Result();
	        result.setResultCode(Constants.RESULT_CODE_SUCCESS);
	        //result.setMessage();
	        result.setData(data);
	        return result;
	    }
	    
	    public static Result genSuccessResult(String updatemessage,String addmessage,String delemessage) {
	        Result result = new Result();
	        result.setResultCode(Constants.RESULT_CODE_SUCCESS);
	        result.setMessage(updatemessage+addmessage+delemessage);
	        return result;
	    }
	    
	    public static Result genSuccessResult(String updatemessage,String addmessage) {
	        Result result = new Result();
	        result.setResultCode(Constants.RESULT_CODE_SUCCESS);
	        result.setMessage(updatemessage+addmessage);
	        return result;
	    }

	    public static Result genFailResult(String message) {
	        Result result = new Result();
	        result.setResultCode(Constants.RESULT_CODE_SERVER_ERROR);
	        if (message == null || message.length() < 1) {
	            message = DEFAULT_FAIL_MESSAGE;
	        }
	        result.setMessage(message);
	        return result;
	    }
}
