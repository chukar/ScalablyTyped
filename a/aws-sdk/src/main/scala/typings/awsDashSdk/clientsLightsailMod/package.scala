package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsLightsailMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.AutoSnapshot
  import typings.awsDashSdk.awsDashSdkStrings.mysql_
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.inbound__
    - typings.awsDashSdk.awsDashSdkStrings.outbound__
    - java.lang.String
  */
  type AccessDirection = _AccessDirection | String
  type AddOnList = js.Array[AddOn]
  type AddOnRequestList = js.Array[AddOnRequest]
  type AddOnType = AutoSnapshot | String
  type AttachedDiskList = js.Array[AttachedDisk]
  type AttachedDiskMap = StringDictionary[DiskMapList]
  type AutoSnapshotDate = String
  type AutoSnapshotDetailsList = js.Array[AutoSnapshotDetails]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Success_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.NotFound
    - java.lang.String
  */
  type AutoSnapshotStatus = _AutoSnapshotStatus | String
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type Base64 = String
  type BlueprintList = js.Array[Blueprint]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.os_
    - typings.awsDashSdk.awsDashSdkStrings.app
    - java.lang.String
  */
  type BlueprintType = _BlueprintType | String
  type BundleList = js.Array[Bundle]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CloudFormationStackRecordList = js.Array[CloudFormationStackRecord]
  type CloudFormationStackRecordSourceInfoList = js.Array[CloudFormationStackRecordSourceInfo]
  type CloudFormationStackRecordSourceType = typings.awsDashSdk.awsDashSdkStrings.ExportSnapshotRecord | String
  type DiskInfoList = js.Array[DiskInfo]
  type DiskList = js.Array[Disk]
  type DiskMapList = js.Array[DiskMap]
  type DiskSnapshotList = js.Array[DiskSnapshot]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.completed__
    - typings.awsDashSdk.awsDashSdkStrings.error__
    - typings.awsDashSdk.awsDashSdkStrings.unknown__
    - java.lang.String
  */
  type DiskSnapshotState = _DiskSnapshotState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.error__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.`in-use`
    - typings.awsDashSdk.awsDashSdkStrings.unknown__
    - java.lang.String
  */
  type DiskState = _DiskState | String
  type DomainEntryList = js.Array[DomainEntry]
  type DomainEntryOptions = StringDictionary[String]
  type DomainEntryOptionsKeys = String
  type DomainEntryType = String
  type DomainList = js.Array[Domain]
  type DomainName = String
  type DomainNameList = js.Array[DomainName]
  type ExportSnapshotRecordList = js.Array[ExportSnapshotRecord]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InstanceSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.DiskSnapshot
    - java.lang.String
  */
  type ExportSnapshotRecordSourceType = _ExportSnapshotRecordSourceType | String
  type HostKeysList = js.Array[HostKeyAttributes]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ssh_
    - typings.awsDashSdk.awsDashSdkStrings.rdp
    - java.lang.String
  */
  type InstanceAccessProtocol = _InstanceAccessProtocol | String
  type InstanceEntryList = js.Array[InstanceEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LbDotRegistrationInProgress
    - typings.awsDashSdk.awsDashSdkStrings.LbDotInitialHealthChecking
    - typings.awsDashSdk.awsDashSdkStrings.LbDotInternalError
    - typings.awsDashSdk.awsDashSdkStrings.InstanceDotResponseCodeMismatch
    - typings.awsDashSdk.awsDashSdkStrings.InstanceDotTimeout
    - typings.awsDashSdk.awsDashSdkStrings.InstanceDotFailedHealthChecks
    - typings.awsDashSdk.awsDashSdkStrings.InstanceDotNotRegistered
    - typings.awsDashSdk.awsDashSdkStrings.InstanceDotNotInUse
    - typings.awsDashSdk.awsDashSdkStrings.InstanceDotDeregistrationInProgress
    - typings.awsDashSdk.awsDashSdkStrings.InstanceDotInvalidState
    - typings.awsDashSdk.awsDashSdkStrings.InstanceDotIpUnusable
    - java.lang.String
  */
  type InstanceHealthReason = _InstanceHealthReason | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.initial_
    - typings.awsDashSdk.awsDashSdkStrings.healthy__
    - typings.awsDashSdk.awsDashSdkStrings.unhealthy__
    - typings.awsDashSdk.awsDashSdkStrings.unused
    - typings.awsDashSdk.awsDashSdkStrings.draining_
    - typings.awsDashSdk.awsDashSdkStrings.unavailable__
    - java.lang.String
  */
  type InstanceHealthState = _InstanceHealthState | String
  type InstanceHealthSummaryList = js.Array[InstanceHealthSummary]
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CPUUtilization
    - typings.awsDashSdk.awsDashSdkStrings.NetworkIn
    - typings.awsDashSdk.awsDashSdkStrings.NetworkOut
    - typings.awsDashSdk.awsDashSdkStrings.StatusCheckFailed
    - typings.awsDashSdk.awsDashSdkStrings.StatusCheckFailed_Instance
    - typings.awsDashSdk.awsDashSdkStrings.StatusCheckFailed_System
    - java.lang.String
  */
  type InstanceMetricName = _InstanceMetricName | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LINUX_UNIX
    - typings.awsDashSdk.awsDashSdkStrings.WINDOWS
    - java.lang.String
  */
  type InstancePlatform = _InstancePlatform | String
  type InstancePlatformList = js.Array[InstancePlatform]
  type InstancePortInfoList = js.Array[InstancePortInfo]
  type InstancePortStateList = js.Array[InstancePortState]
  type InstanceSnapshotList = js.Array[InstanceSnapshot]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.error__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - java.lang.String
  */
  type InstanceSnapshotState = _InstanceSnapshotState | String
  type IpAddress = String
  type IpV6Address = String
  type IsoDate = Date
  type KeyPairList = js.Array[KeyPair]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HealthCheckPath
    - typings.awsDashSdk.awsDashSdkStrings.SessionStickinessEnabled
    - typings.awsDashSdk.awsDashSdkStrings.SessionStickiness_LB_CookieDurationSeconds
    - java.lang.String
  */
  type LoadBalancerAttributeName = _LoadBalancerAttributeName | String
  type LoadBalancerConfigurationOptions = StringDictionary[String]
  type LoadBalancerList = js.Array[LoadBalancer]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ClientTLSNegotiationErrorCount
    - typings.awsDashSdk.awsDashSdkStrings.HealthyHostCount
    - typings.awsDashSdk.awsDashSdkStrings.UnhealthyHostCount
    - typings.awsDashSdk.awsDashSdkStrings.HTTPCode_LB_4XX_Count
    - typings.awsDashSdk.awsDashSdkStrings.HTTPCode_LB_5XX_Count
    - typings.awsDashSdk.awsDashSdkStrings.HTTPCode_Instance_2XX_Count
    - typings.awsDashSdk.awsDashSdkStrings.HTTPCode_Instance_3XX_Count
    - typings.awsDashSdk.awsDashSdkStrings.HTTPCode_Instance_4XX_Count
    - typings.awsDashSdk.awsDashSdkStrings.HTTPCode_Instance_5XX_Count
    - typings.awsDashSdk.awsDashSdkStrings.InstanceResponseTime
    - typings.awsDashSdk.awsDashSdkStrings.RejectedConnectionCount
    - typings.awsDashSdk.awsDashSdkStrings.RequestCount
    - java.lang.String
  */
  type LoadBalancerMetricName = _LoadBalancerMetricName | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HTTP_HTTPS
    - typings.awsDashSdk.awsDashSdkStrings.HTTP
    - java.lang.String
  */
  type LoadBalancerProtocol = _LoadBalancerProtocol | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.provisioning_
    - typings.awsDashSdk.awsDashSdkStrings.active_impaired
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.unknown__
    - java.lang.String
  */
  type LoadBalancerState = _LoadBalancerState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_VALIDATION
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - java.lang.String
  */
  type LoadBalancerTlsCertificateDomainStatus = _LoadBalancerTlsCertificateDomainStatus | String
  type LoadBalancerTlsCertificateDomainValidationOptionList = js.Array[LoadBalancerTlsCertificateDomainValidationOption]
  type LoadBalancerTlsCertificateDomainValidationRecordList = js.Array[LoadBalancerTlsCertificateDomainValidationRecord]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NO_AVAILABLE_CONTACTS
    - typings.awsDashSdk.awsDashSdkStrings.ADDITIONAL_VERIFICATION_REQUIRED
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_NOT_ALLOWED
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_PUBLIC_DOMAIN
    - typings.awsDashSdk.awsDashSdkStrings.OTHER
    - java.lang.String
  */
  type LoadBalancerTlsCertificateFailureReason = _LoadBalancerTlsCertificateFailureReason | String
  type LoadBalancerTlsCertificateList = js.Array[LoadBalancerTlsCertificate]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_AUTO_RENEWAL
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_VALIDATION
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type LoadBalancerTlsCertificateRenewalStatus = _LoadBalancerTlsCertificateRenewalStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNSPECIFIED
    - typings.awsDashSdk.awsDashSdkStrings.KEY_COMPROMISE
    - typings.awsDashSdk.awsDashSdkStrings.CA_COMPROMISE
    - typings.awsDashSdk.awsDashSdkStrings.AFFILIATION_CHANGED
    - typings.awsDashSdk.awsDashSdkStrings.SUPERCEDED
    - typings.awsDashSdk.awsDashSdkStrings.CESSATION_OF_OPERATION
    - typings.awsDashSdk.awsDashSdkStrings.CERTIFICATE_HOLD
    - typings.awsDashSdk.awsDashSdkStrings.REMOVE_FROM_CRL
    - typings.awsDashSdk.awsDashSdkStrings.PRIVILEGE_WITHDRAWN
    - typings.awsDashSdk.awsDashSdkStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type LoadBalancerTlsCertificateRevocationReason = _LoadBalancerTlsCertificateRevocationReason | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_VALIDATION
    - typings.awsDashSdk.awsDashSdkStrings.ISSUED
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - typings.awsDashSdk.awsDashSdkStrings.VALIDATION_TIMED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.REVOKED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - java.lang.String
  */
  type LoadBalancerTlsCertificateStatus = _LoadBalancerTlsCertificateStatus | String
  type LoadBalancerTlsCertificateSummaryList = js.Array[LoadBalancerTlsCertificateSummary]
  type LogEventList = js.Array[LogEvent]
  type MetricDatapointList = js.Array[MetricDatapoint]
  type MetricPeriod = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Minimum_
    - typings.awsDashSdk.awsDashSdkStrings.Maximum_
    - typings.awsDashSdk.awsDashSdkStrings.Sum_
    - typings.awsDashSdk.awsDashSdkStrings.Average_
    - typings.awsDashSdk.awsDashSdkStrings.SampleCount
    - java.lang.String
  */
  type MetricStatistic = _MetricStatistic | String
  type MetricStatisticList = js.Array[MetricStatistic]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Seconds_
    - typings.awsDashSdk.awsDashSdkStrings.Microseconds
    - typings.awsDashSdk.awsDashSdkStrings.Milliseconds_
    - typings.awsDashSdk.awsDashSdkStrings.Bytes_
    - typings.awsDashSdk.awsDashSdkStrings.Kilobytes
    - typings.awsDashSdk.awsDashSdkStrings.Megabytes
    - typings.awsDashSdk.awsDashSdkStrings.Gigabytes
    - typings.awsDashSdk.awsDashSdkStrings.Terabytes
    - typings.awsDashSdk.awsDashSdkStrings.Bits_
    - typings.awsDashSdk.awsDashSdkStrings.Kilobits
    - typings.awsDashSdk.awsDashSdkStrings.Megabits
    - typings.awsDashSdk.awsDashSdkStrings.Gigabits
    - typings.awsDashSdk.awsDashSdkStrings.Terabits
    - typings.awsDashSdk.awsDashSdkStrings.Percent_
    - typings.awsDashSdk.awsDashSdkStrings.Count_
    - typings.awsDashSdk.awsDashSdkStrings.BytesSlashSecond
    - typings.awsDashSdk.awsDashSdkStrings.KilobytesSlashSecond
    - typings.awsDashSdk.awsDashSdkStrings.MegabytesSlashSecond
    - typings.awsDashSdk.awsDashSdkStrings.GigabytesSlashSecond
    - typings.awsDashSdk.awsDashSdkStrings.TerabytesSlashSecond
    - typings.awsDashSdk.awsDashSdkStrings.BitsSlashSecond
    - typings.awsDashSdk.awsDashSdkStrings.KilobitsSlashSecond
    - typings.awsDashSdk.awsDashSdkStrings.MegabitsSlashSecond
    - typings.awsDashSdk.awsDashSdkStrings.GigabitsSlashSecond
    - typings.awsDashSdk.awsDashSdkStrings.TerabitsSlashSecond
    - typings.awsDashSdk.awsDashSdkStrings.CountSlashSecond
    - typings.awsDashSdk.awsDashSdkStrings.None_
    - java.lang.String
  */
  type MetricUnit = _MetricUnit | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.tcp_
    - typings.awsDashSdk.awsDashSdkStrings.all__
    - typings.awsDashSdk.awsDashSdkStrings.udp_
    - java.lang.String
  */
  type NetworkProtocol = _NetworkProtocol | String
  type NonEmptyString = String
  type OperationList = js.Array[Operation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NotStarted
    - typings.awsDashSdk.awsDashSdkStrings.Started_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded_
    - java.lang.String
  */
  type OperationStatus = _OperationStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DeleteKnownHostKeys
    - typings.awsDashSdk.awsDashSdkStrings.DeleteInstance
    - typings.awsDashSdk.awsDashSdkStrings.CreateInstance
    - typings.awsDashSdk.awsDashSdkStrings.StopInstance
    - typings.awsDashSdk.awsDashSdkStrings.StartInstance
    - typings.awsDashSdk.awsDashSdkStrings.RebootInstance
    - typings.awsDashSdk.awsDashSdkStrings.OpenInstancePublicPorts
    - typings.awsDashSdk.awsDashSdkStrings.PutInstancePublicPorts
    - typings.awsDashSdk.awsDashSdkStrings.CloseInstancePublicPorts
    - typings.awsDashSdk.awsDashSdkStrings.AllocateStaticIp
    - typings.awsDashSdk.awsDashSdkStrings.ReleaseStaticIp
    - typings.awsDashSdk.awsDashSdkStrings.AttachStaticIp
    - typings.awsDashSdk.awsDashSdkStrings.DetachStaticIp
    - typings.awsDashSdk.awsDashSdkStrings.UpdateDomainEntry
    - typings.awsDashSdk.awsDashSdkStrings.DeleteDomainEntry
    - typings.awsDashSdk.awsDashSdkStrings.CreateDomain
    - typings.awsDashSdk.awsDashSdkStrings.DeleteDomain
    - typings.awsDashSdk.awsDashSdkStrings.CreateInstanceSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.DeleteInstanceSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.CreateInstancesFromSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.CreateLoadBalancer
    - typings.awsDashSdk.awsDashSdkStrings.DeleteLoadBalancer
    - typings.awsDashSdk.awsDashSdkStrings.AttachInstancesToLoadBalancer
    - typings.awsDashSdk.awsDashSdkStrings.DetachInstancesFromLoadBalancer
    - typings.awsDashSdk.awsDashSdkStrings.UpdateLoadBalancerAttribute
    - typings.awsDashSdk.awsDashSdkStrings.CreateLoadBalancerTlsCertificate
    - typings.awsDashSdk.awsDashSdkStrings.DeleteLoadBalancerTlsCertificate
    - typings.awsDashSdk.awsDashSdkStrings.AttachLoadBalancerTlsCertificate
    - typings.awsDashSdk.awsDashSdkStrings.CreateDisk
    - typings.awsDashSdk.awsDashSdkStrings.DeleteDisk
    - typings.awsDashSdk.awsDashSdkStrings.AttachDisk
    - typings.awsDashSdk.awsDashSdkStrings.DetachDisk
    - typings.awsDashSdk.awsDashSdkStrings.CreateDiskSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.DeleteDiskSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.CreateDiskFromSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.CreateRelationalDatabase
    - typings.awsDashSdk.awsDashSdkStrings.UpdateRelationalDatabase
    - typings.awsDashSdk.awsDashSdkStrings.DeleteRelationalDatabase
    - typings.awsDashSdk.awsDashSdkStrings.CreateRelationalDatabaseFromSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.CreateRelationalDatabaseSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.DeleteRelationalDatabaseSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.UpdateRelationalDatabaseParameters
    - typings.awsDashSdk.awsDashSdkStrings.StartRelationalDatabase
    - typings.awsDashSdk.awsDashSdkStrings.RebootRelationalDatabase
    - typings.awsDashSdk.awsDashSdkStrings.StopRelationalDatabase
    - typings.awsDashSdk.awsDashSdkStrings.EnableAddOn
    - typings.awsDashSdk.awsDashSdkStrings.DisableAddOn
    - java.lang.String
  */
  type OperationType = _OperationType | String
  type PendingMaintenanceActionList = js.Array[PendingMaintenanceAction]
  type Port = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Public_
    - typings.awsDashSdk.awsDashSdkStrings.Private_
    - java.lang.String
  */
  type PortAccessType = _PortAccessType | String
  type PortInfoList = js.Array[PortInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.CLOSED
    - java.lang.String
  */
  type PortInfoSourceType = _PortInfoSourceType | String
  type PortList = js.Array[Port]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.open__
    - typings.awsDashSdk.awsDashSdkStrings.closed_
    - java.lang.String
  */
  type PortState = _PortState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Started_
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type RecordState = _RecordState | String
  type RegionList = js.Array[Region]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`us-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-east-2`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-2`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-2`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-3`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-central-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ca-central-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-south-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-2`
    - java.lang.String
  */
  type RegionName = _RegionName | String
  type RelationalDatabaseBlueprintList = js.Array[RelationalDatabaseBlueprint]
  type RelationalDatabaseBundleList = js.Array[RelationalDatabaseBundle]
  type RelationalDatabaseEngine = mysql_ | String
  type RelationalDatabaseEventList = js.Array[RelationalDatabaseEvent]
  type RelationalDatabaseList = js.Array[RelationalDatabase]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CPUUtilization
    - typings.awsDashSdk.awsDashSdkStrings.DatabaseConnections
    - typings.awsDashSdk.awsDashSdkStrings.DiskQueueDepth
    - typings.awsDashSdk.awsDashSdkStrings.FreeStorageSpace
    - typings.awsDashSdk.awsDashSdkStrings.NetworkReceiveThroughput
    - typings.awsDashSdk.awsDashSdkStrings.NetworkTransmitThroughput
    - java.lang.String
  */
  type RelationalDatabaseMetricName = _RelationalDatabaseMetricName | String
  type RelationalDatabaseParameterList = js.Array[RelationalDatabaseParameter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CURRENT
    - typings.awsDashSdk.awsDashSdkStrings.PREVIOUS
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - java.lang.String
  */
  type RelationalDatabasePasswordVersion = _RelationalDatabasePasswordVersion | String
  type RelationalDatabaseSnapshotList = js.Array[RelationalDatabaseSnapshot]
  type ResourceArn = String
  type ResourceName = String
  type ResourceNameList = js.Array[ResourceName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Instance_
    - typings.awsDashSdk.awsDashSdkStrings.StaticIp
    - typings.awsDashSdk.awsDashSdkStrings.KeyPair
    - typings.awsDashSdk.awsDashSdkStrings.InstanceSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.Domain_
    - typings.awsDashSdk.awsDashSdkStrings.PeeredVpc
    - typings.awsDashSdk.awsDashSdkStrings.LoadBalancer
    - typings.awsDashSdk.awsDashSdkStrings.LoadBalancerTlsCertificate
    - typings.awsDashSdk.awsDashSdkStrings.Disk
    - typings.awsDashSdk.awsDashSdkStrings.DiskSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.RelationalDatabase
    - typings.awsDashSdk.awsDashSdkStrings.RelationalDatabaseSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.ExportSnapshotRecord
    - typings.awsDashSdk.awsDashSdkStrings.CloudFormationStackRecord
    - java.lang.String
  */
  type ResourceType = _ResourceType | String
  type SensitiveString = String
  type StaticIpList = js.Array[StaticIp]
  type StringList = js.Array[String]
  type StringMax256 = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TimeOfDay = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-11-28`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type double = Double
  type float = Double
  type integer = Double
  type timestamp = Date
}
