package rishark.pcap.frame.link.network.protocols.ipv4.transport.application.protocols.ftp;

public enum FTPCode {

    RESTART_MARKER_REPLY("110"),
    SERVICE_READY_IN_NNN_MINUTES("120"),
    DATA_CONNECTION_ALREADY_OPEN("125"),
    FILE_STATUS_OKAY("150"),
    COMMAND_OKAY("200"),
    COMMAND_NOT_IMPLEMENTED_SUPERFLUOUS("202"),
    SYSTEM_STATUS("211"),
    DIRECTORY_STATUS("212"),
    FILE_STATUS("213"),
    HELP_MESSAGE("214"),
    NAME_SYSTEM_TYPE("215"),
    SERVICE_READY_FOR_NEW_USER("220"),
    SERVICE_CLOSING_CONTROL_CONNECTION("221"),
    DATA_CONNECTION_OPEN("225"),
    CLOSING_DATA_CONNECTION("226"),
    ENTERING_PASSIVE_MODE("227"),
    ENTERING_LONG_PASSIVE_MODE("228"),
    EXTENDED_PASSIVE_MODE_ENTERED("229"),
    USER_LOGGING_IN("230"),
    REQUESTED_FILE_ACTION_OKAY("250"),
    PATHNAME_CREATED("257"),
    USER_NAME_OKAY_NEED_PASSWORD("331"),
    NEED_ACCOUNT_FOR_LOGGING("332"),
    REQUESTED_FILE_ACTION_PENDING_FURTHER_INFORMATION("350"),
    SERVICE_NOT_AVAILABLE_CLOSING_CONTROL_CONNECTION("421"),
    CANT_OPEN_DATA_CONNECTION("425"),
    CONNECTION_CLOSED_TRANSFER_ABORTED("426"),
    REQUESTED_FILE_ACTION_NOT_TAKEN("450"),
    REQUESTED_ACTION_ABORTED("451"),
    REQUESTED_ACTION_NOT_TAKEN("452"),
    SYNTAX_ERROR_COMMAND_UNRECOGNIZED("500"),
    SYNTAX_ERROR_IN_PARAMETERS_OR_ARGUMENTS("501"),
    COMMAND_NOT_IMPLEMENTED("502"),
    BAD_SEQUENCE_OF_COMMANDS("503"),
    COMMAND_NOT_IMPLEMENTED_FOR_THAT_PARAMETER("504"),
    SUPPORTED_ADDRESS_FAMILIES_ARE("521"),
    PROTOCOL_NOT_SUPPORTED("522"),
    NOT_LOGGED_IN("530"),
    NEED_ACCOUNT_FOR_STORING_FILES("532"),
    REQUESTED_ACTION_NOT_TAKEN_("550"),
    REQUESTED_ACTION_ABORTED_("551"),
    REQUESTED_FILE_ACTION_ABORTED("552"),
    REQUESTED_ACTION_NOT_TAKEN__("553"),
    REQUESTED_ACTION_NOT_TAKEN_INVALID_REST_PARAMETER("554"),
    REQUESTED_ACTION_NOT_TAKEN_TYPE("555");

    private final String ftpCode;

    FTPCode(String ftpCode) {
        this.ftpCode = ftpCode;
    }

    public static FTPCode findFtpCode(String i){
        for(FTPCode ip : FTPCode.values()) {
            if(ip.getFtpCode().equals(i)) {
                return ip;
            }
        }
        return null;
    }

    public String getFtpCode() {
        return ftpCode;
    }
}