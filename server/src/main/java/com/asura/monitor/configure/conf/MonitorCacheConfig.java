package com.asura.monitor.configure.conf;

/**
 * <p></p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 * 监控缓存key，统一配置入口
 *
 * @author zhaozq
 * @version 1.0
 * @Date 2016-09-14
 * @since 1.0
 */
public class MonitorCacheConfig {

    // 存放每个主机对应的在cmdb的id
    public static final String hostsIdKey = "cache_hosts_id_";

    // 存放有配置的主机的配置信息
    public static final String cacheConfigureHostsListKey = "cache_configure_hosts_list";

    // 存放有配置的组的信息组 cache_configure_groups_list_groupsId
    public static final String cacheConfigureGroupsListKey = "cache_configure_groups_list";

    // 存放主机的配置文件， 里面放的配置 cache_host_configure_hostId
    public static final String cacheHostCnfigureKey = "cache_host_configure_";

    // 存放组的配置文件，里面放的配置
    public static final String cacheGroupsConfigureKey = "cache_groups_configure_";

    // 项目缓存 cache_item_itemId CACHE_ITEM_KEY
    public static final String cacheItemKey = "cache_item_";

    // 存放脚本的信息的key cache_script_scriptId
    public static final String cacheScriptKey = "cache_script_";

    // 存放脚本的信息的key cache_script_scriptId
    public static final String cacheScriptIdKey = "cache_script_id_";

    // 联系组的缓存key，存放报警联系组的 cache_contact_group_groupId
    public static final String cacheContactGroupKey = "cache_contact_group_";

    // 联系人的key，存储联系人 cache_contact_contactsId
    public static final String cacheContactKey = "cache_contact_";

    // 缓存模板配置
    public static final String cacheTemplateKey = "cache_template_";

    // 缓存监控组
    public static final String cacheGroupsKey = "cache_groups_";

    // 保存配置文件 cache_configure_configureId
    public static final String cacheConfigureKey = "cache_configure_";

    // 保存所有host的id,有效的监控, ageng可以从这里判断是否需要开启监控
    public static final String cacheAllHostIsValid = "cache_all_host_is_valid";

    // 保存所有groups的id,有效的监控, ageng可以从这里判断是否需要开启监控
    public static final String cacheAllGroupsIsValid = "cache_all_groups_is_valid";

    // 存放每个host id的组的id,能获取到自己的组 cache_host_groups_hostID
    public static final String cacheHostGroupsKey = "cache_host_groups_";

    // 存放每个host id对应的所有配置文件id cache_host_config_HostId
    public static final String cacheHostConfigKey = "cache_host_config_";

    // 存放每个组对应的所有配置文件
    public static final String cacheGroupConfigKey = "cache_group_config_";

    // 存放每个主机的业务线 cache_get_cache_host_groups_hostId
    public static final String getCacheHostGroupsKey = "cache_get_cache_host_groups_";

    // 存放每个业务线的可用的数据 cache_groups_is_success_groupsId
    public static final String cacheGroupsIsSuccessKey = "cache_groups_is_success_";

    // 存放每个业务线的不可用数据 cache_groups_is_faild_groupsId
    public static final String cacheGroupsIsFaildKey = "cache_groups_is_faild_";

    // 存放每个业务线的警告数据 cache_groups_is_warning_groupsId
    public static final String cacheGroupsIsWarningKey = "cache_groups_is_warning_";

    // 存放每个业务线的未知数据 cache_groups_is_unknown_groupsId
    public static final String cacheGroupsIsUnknownKey = "cache_groups_is_unknown_";

    // 报警队列设置, 使用redis队列, 不保证数据
    public static final String cacheAlarmQueueKey = "cache_alarm_queue";

    //  缓存业务线的名称 cache_group_name_业务线ID, MAP类型
    public static final String cacheGroupName = "cache_group_name";

    // 存放每个主机id对应的IP地址 cache_host_id_to_ip_CMDB的server_id
    public static final String cacheHostIdToIp = "cache_host_id_to_ip_";

    // 缓存报警消息通道ID cache_channel_channelId
    public static final String cacheChannelKey = "cache_channel_";

    // 每个host存放一个总的update类型，每次有更新时里面记录更新的类型, 然后agent去获取相对应的数据
    // 队列类型, 每台主机一个key 主机ID
    public static final String cacheHostUpdateQueue = "cache_host_update_map_";

    // 存放agent不响应的队列， map类型， id加时间戳
    public static final String cacheAgentUnreachable = "cache_agent_unreachable";

    // 存放agent正常上传数据的
    public static final String cacheAgentIsOk = "cache_agent_is_ok";

    // 存放每个业务线里面的服务器ID  cache_groups_hosts_服务器ID， HashSet
    public static final String cacheGroupsHosts = "cache_groups_hosts_";


    // 缓存管理员组,所有的报警都发管理员组, Map 类型
    public static final String cacheIsAdmin = "cache_is_admin";

    // 缓存默认监控
    public static final String cacheIsDefault = "cache_is_default";

    // 发送报警开关
    public static final String cacheAlarmSwitch = "cache_alarm_switch";

    // 存放每个机器的报警状态数据 cache_host_status_map_hostid
    public static final String cacheHostStatusMap = "cache_host_status_map_";

    // 队列消息存放默认脚本更新后触发监控更新 cache_default_change_queue_HOSTID
    public static final String cacheDefaultChangeQueue = "cache_default_change_queue_";

    // 存放服务器信息的缓存 map 类型
    // 存放启动的端口, 主机名, cache_agent_server_info_hostid
    public static final String cacheAgentServerInfo = "cache_agent_server_info_";

    // 保存每个指标对应的id
    public static final String cacheIndexScript = "cache_index_script_";

    // 保存系统数据上传脚本 cache_system_script_os名称
    public static final String cacheSystemScript = "cache_system_script_";

    // 存放主机是否存活 cache_host_is_update_id Long 类型
    public static final String cacheHostIsUpdate = "cache_host_is_update_";

    // 画图使用存放机器的队列
    public static final String mergerDataQueue = "cache_merger_data_queue_";

    // 图片合并任务计划锁
    public static final String mergerDataLock = "cache_merger_data_lock";

    // index名称刷新锁
    public static final String updateIndexNameLock = "cache_update_index_name_lock";

    // 缓存push服务器的地址,多个用逗号分隔
    public static final String cachePushServer = "cache_push_server";

    // 存储监控 cache_agent_version_hostid
    public static final String cacheAgentVersion = "cache_agent_v_";

    // 上报agent的cpu数量
    public static final String cacheAgentCpu = "cache_agent_cpu_";

}
