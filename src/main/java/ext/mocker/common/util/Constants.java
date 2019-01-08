package ext.mocker.common.util;

public class Constants
{
  public static final String DEFAULT_ROUTE_CFG_FILE = "route.properties";
  public static final String DEFAULT_SETTING_CONFIG_FILE = "config.properties";
  public static final String DEFAULT_JAR_DIR = "jarDir";
  public static final String DEFAULT_MOCK_DIR = "mockDir";
  public static final String SCRIPT_PARAMS_KEY = "params";
  public static final String SCRIPT_REQUEST_KEY = "request";
  public static final String SCRIPT_REQUEST_CONTENT_KEY = "requestContent";
  public static final String SCRIPT_REQUEST_HEADERS_KEY = "requestHeaders";
  public static final String SCRIPT_RESPONSE_HEADERS_KEY = "responseHeaders";
  public static final String HTTP_HEADER_STATUS_CODE = "StatusCode";
  public static final String OSP_MOCKER_STATIC_ROUTE = "osp.mocker.static.route";
  public static final String VIP_OSP_STATIC_ROUTE = "osp.static.route";
  public static final String VIP_OSP_STATIC_ROUTE_ENV = "VIP_OSP_STATIC_ROUTE";
  public static final String VIP_OSP_LOCAL_PROXY = "VIP_OSP_LOCAL_PROXY";
  public static final String VIP_OSP_REMOTE_PROXY = "VIP_OSP_REMOTE_PROXY";
  public static final String OSP_MOCKER_REGISTER_SERVICE = "OSP_MOCKER_REGISTER_SERVICE";
  public static final String VIP_CFGCENTER_ZK_CONNECTION = "VIP_CFGCENTER_ZK_CONNECTION";
  public static final String VIP_CFGCENTER_PARTITION = "VIP_CFGCENTER_PARTITION";
  public static final String DEFAULT_CFGCENTER_PARTITION = "default";
  public static final String MOCKER_STATIC_ROUTE_CFG = "MOCKER_STATIC_ROUTE_CFG";
  public static final String MOCKER_STATIC_ENV_CFG = "MOCKER_STATIC_ENV_CFG";
  public static final String MOCKER_WORKER_POOL_SIZE = "WORKER_POOL_SIZE";
  public static final String MOCKER_BOSS_POOL_SIZE = "BOSS_POOL_SIZE";
  public static final String LOCAL_IP = "127.0.0.1";
  public static final int KAFKA_PORT = 9092;
  public static final int RABBITMQ_PORT = 5672;
  public static final int ZK_PORT = 2181;
  public static final String KEY_LOG_LEVEL = "loglevel";
  public static final String KEY_LOG_FILTER_INCLUDE_EXP = "LOG_FILTER_INCLUDE_EXP";
  public static final String KEY_LOG_FILTER_EXCLUDE_EXP = "LOG_FILTER_EXCLUDE_EXP";
  public static final String PERFORMANCE_MODE = "PERFORMANCE_MODE";
  public static final String ACCESS_LOG = "ACCESS_LOG";
  public static final String HTTP_IDLE_TIMEOUT = "HTTP_IDLE_TIMEOUT";
  public static final String HTTP_CONTENT_ENCODING = "HTTP_CONTENT_ENCODING";
  public static final String REMOTE_MOCK_STUB_NOT_HIT_HEADER = "STUB_NOT_HIT";
  public static final String REMOTE_MOCK_EXCEPTION_HEADER = "Mock-Exception";
  public static final int DEFAULT_OSP_SERVER_PORT = 2081;
  public static final int DEFAULT_VMS_SERVER_PORT = 3081;
  public static final int DEFAULT_SSL_SERVER_PORT = 443;
  public static final int DEFAULT_HTTP_SERVER_PORT = 80;
  public static final String KEY_USE_SSL = "USE_SSL";
  public static final String MOCKER_SERVICE_PORT = "port";
  public static final String MOCKER_SSL_SERVICE_PORT = "sslPort";
  public static final String ADMIN_URI_CONTEXT = "mockerAdmin";
  public static final String DEFAULT_MOCKER_LOG_LEVEL = "DEBUG";
  public static final String KEY_MOCKER_LOG_LEVEL = "MOCK_LOG_LEVEL";
  public static final String TRACE_LOGGER_NAME = "OSP_REQUEST";
  public static final String ACCESS_LOGGER_NAME = "OSP_ACCESS";
  public static final String URI_PING = "ping";
  public static final String REMOTE_MOCK_ID_KEY = "mockId";
  public static final String URI_PARAM_METHOD_NAME = "method";
  public static final String URI_PARAM_VERSION = "version";
  public static final String URI_PARAM_CALLER_IP = "callerIp";
  public static final String URI_PARAM_SERVICE_NAME = "serviceName";
  public static final String URI_PARAM_TRANSACTION_ID = "transactionId";
  public static final String HTTP_HEADER_SEQUENCE = "sequence";
  public static final String OSP_SERVICE_CALLEE_TIMEOUT = "OSP_SERVICE_CALLEE_TIMEOUT";
  public static final String MOCKER_REDIRECT_UNHANDLED_REQUEST = "redirect";
  public static final String PERFORMANCE_MODE_LAZY_PARAM = "PERFORMANCE_MODE_LAZY_PARAM";
  public static final String CLUSTER_LOAD_BALANCE_RULE = "CLUSTER_LOAD_BALANCE_RULE";
  public static final String CLUSTER_MASTER = "CLUSTER_MASTER";
  public static final String CLUSTER_TYPE_KEY = "CLUSTER_NODE_TYPE";
  public static final String CLUSTER_TYPE_MASTER = "master";
  public static final String CLUSTER_TYPE_NODE = "node";
  public static final String CLUSTER_TYPE_MASTER_AND_NODE = "master-node";
  public static final String CLUSTER_COMM_URI = "/ospmocker/cluster?method=connect";
  public static final String CLUSTER_CONNECT_HEADER = "Node-Address";
  public static final String CLUSTER_HEALTH_CHECK_PERIOD = "CLUSTER_HEALTH_CHECK_PERIOD";
  public static final String MOCKER_JSON_CONVERTER_KEY = "jsonTool";
  public static final String MOCKER_JSON_CONVERTER_GSON = "gson";
  public static final String MOCKER_JSON_CONVERTER_FASTJON = "fastJson";
  public static final String OFFICE_EXCEL_2003_POSTFIX = "xls";
  public static final String OFFICE_EXCEL_2010_POSTFIX = "xlsx";
  public static final String NULL = "null";
  public static final String VMS_MOCKER_APP_NAME = "vms.mocker.plus";
  public static final String OUTBOUND_MESSAGE_BATCH_SIZE = "OUTBOUND_MESSAGE_BATCH_SIZE";
  public static final String OSP_MOCKER_SDK_HTTP_PORT_KEY = "$OSP_MOCKER_SDK_HTTP_PORT";
}

