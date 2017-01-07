package $enum;

import java.util.HashMap;
import java.util.Map;

public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println("" + PowerSwitch.ON.getKrName());
		
		System.out.println("" + RESPONSE_STATUS.BAD_REQUEST.Name());

	}
	
	public enum PowerSwitch {
		//
		ON(100, "켜짐"),
		OFF(200, "꺼짐");
		
		private String krName;
		
		private PowerSwitch(){
			//
		}

		private PowerSwitch(int value, String krName){
			this.krName = krName;
		}
		
		public String getKrName(){
			return krName;
		}
		
		public PowerSwitch opposite() {
			// 
			if (this == PowerSwitch.ON) {
				return PowerSwitch.OFF;  
			} else {
				return PowerSwitch.ON; 
			}
		}
	}
	
	
	public enum RESPONSE_STATUS {  // Response Status enum.
		UNDEFINED(-1, "UNDEFINED"), 		// -1 (Internal usage)
		NETWORK_FAILURE(9001, "NETWORK_FAILURE"),		// -1 (Network Failure) - Internal Usage
		COMMAND_TIMEOUT(9002, "COMMAND_TIMEOUT"),		// -1 (Command Timeout) - Internal Usage - SO/SDA 연동
		
		ACCEPTED(1000, "ACCEPTED"), 		// 202 (Accepted)
		OK(2000, "OK"),						// 200 (OK)
		CREATED(2001, "CREATED"),			// 201 (Created)
		DELETED(2002, "DELETED"),			// 200 (Deleted)
		CHANGED(2004, "CHANGED"),			// 200 (Changed)
		CONFLICT(4105, "CONFLICT"),			// 409 (Conflict)
		BAD_REQUEST(4000, "BAD_REQUEST"),	// 400 (Bad Request)
		UNAUTHORIZED(4001, "UNAUTHORIZED"),	// 401 (Unauthroized)		----- LGU+ Defined status code
		NOT_FOUND(4004, "NOT_FOUND"),		// 404 (Not Found)
		OPERATION_NOT_ALLOWED(4005, "OPERATION_NOT_ALLOWED"),	// 405 (Method Not Allowed)
		REQUEST_TIMEOUT(4008, "REQUEST_TIMEOUT"),					// 408 (Request Timeout)
		SUBSCRIP_CREATOR_NO_PRIVILEGE(4101, "SUBSCRIPTION_CREATOR_HAS_NO_PRIVILEGE"), 	// 403 (Forbidden)
		CONTENTS_UNACCEPTABLE(4102, "CONTENTS_UNACCEPTABLE"), 			// 400 (Bad Request)
		ACCESS_DENIED(4103, "ACCESS_DENIED"),								// 403 (Forbidden)
		GROUP_REQ_ID_EXISTS(4104, "GROUP_REQUEST_IDENTIFIER_EXISTS"),	// 409 (Conflict)
		INTERNAL_SERVER_ERROR(5000, "INTERNAL_SERVER_ERROR"),			// 500 (Internal Server Error)
		NOT_IMPLEMENTED(5001, "NOT_IMPLEMENTED"), 						// 501 (Not Implemented)
		TARGET_NOT_REACHABLE(5103, "TARGET_NOT_REACHABLE"),				// 404 (Not Found)
		NO_PRIVILEGE(5105, "NO_PRIVILEGE"),								// 403 (Forbidden)
		ALREADY_EXISTS(5106, "ALREADY_EXISTS"),							// 403 (Forbidden)
		TARGET_NOT_SUBSCRIBABLE(5203, "TARGET_NOT_SUBSCRIBABLE"),		// 403 (Forbidden)
		SUBSCRIP_VERIFY_INIT_FAILED(5204, "SUBSCRIPTION_VERIFICATION_INITIATION_FAILED"),		// 500 (Internal Server Error)
		SUBSCRIP_HOST_NO_PRIVILEGE(5205, "SUBSCRIPTION_HOST_HAS_NO_PRIVILEGE"), 	// 403 (Forbidden)
		NON_BLOCK_REQ_NOT_SUPPORTED(5206, "NON_BLOCKING_REQUEST_NOT_SUPPORTED"),	// 501 (Not Implemented)
		EXTERNAL_OBJECT_NOT_REACHABLE(6003, "EXTERNAL_OBJECT_NOT_REACHABLE"),		// 404 (Not Found)
		EXTERNAL_OBJECT_NOT_FOUND(6005, "EXTERNAL_OBJECT_NOT_FOUND"),					// 404 (Not Found)
		MAX_NUMBER_OF_MEMBER_EXCEEDED(6010, "MAX_NUMBER_OF_MEMBER_EXCEEDED"),		// 400 (Bad Request)
		MEMBER_TYPE_INCONSISTENT(6011, "MEMBER_TYPE_INCONSISTENT"),					// 400 (Bad Request)
		MGMT_SESSION_CANNOT_ESTABLISH(6020, "MANAGEMENT_SESSION_CANNOT_BE_ESTABLISHED"),	// 500 (Internal Server Error)
		MGMT_SESSION_ESTABLISH_TIMEOUT(6021, "MANAGEMENT_SESSION_ESTABLISHMENT_TIMEOUT"),	// 500 (Internal Server Error)
		INVALID_CMDTYPE(6022, "INVALID_CMDTYPE"),							// 400 (Bad Request)
		INVALID_ARGUMENTS(6023, "INVALID_ARGUMENTS"),					// 400 (Bad Request)
		INSUFFICIENT_ARGUMENT(6024, "INSUFFICIENT_ARGUMENT"), 			// 400 (Bad Request)
		MGMT_CONVERSION_ERROR(6025, "MGMT_CONVERSION_ERROR"),			// 500 (Internal Server Error)
		CANCELLATION_FAILED(6026, "CANCELLATION_FAILED"),				// 500 (Internal Server Error)
		ALREADY_COMPLETE(6028, "ALREADY_COMPLETE"),						// 400 (Bad Request)	
		COMMAND_NOT_CANCELLABLE(6029, "COMMAND_NOT_CANCELLABLE");		// 400 (Bad Request)
		
		
		
		final int value;
		final String name;
		private RESPONSE_STATUS(int value, String name) {
			this.value = value;
			this.name = name;
		}
		
		public int Value() {
			return this.value;
		}
		
		public String Name() {
			return this.name;
		}
		
		private static final Map<Integer, RESPONSE_STATUS> map = 
				new HashMap<Integer, RESPONSE_STATUS>();
		static {
			for(RESPONSE_STATUS en : RESPONSE_STATUS.values()) {
				map.put(en.value, en);
			}
		}
		
		public static RESPONSE_STATUS get(int value) {
			RESPONSE_STATUS en = map.get(value);
			if(en == null) return UNDEFINED;
			return en;
		}
		
		public static boolean isSuccess(RESPONSE_STATUS status) {
			return status.equals(RESPONSE_STATUS.ACCEPTED) || 
					status.equals(RESPONSE_STATUS.OK) || 
					status.equals(RESPONSE_STATUS.CHANGED) || 
					status.equals(RESPONSE_STATUS.DELETED) || 
					status.equals(RESPONSE_STATUS.CREATED);
		}
	}
}
