package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDocdbMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.immediate_
    - typings.awsDashSdk.awsDashSdkStrings.`pending-reboot`
    - java.lang.String
  */
  type ApplyMethod = _ApplyMethod | java.lang.String
  type AttributeValueList = js.Array[String]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AvailabilityZones = js.Array[String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CertificateList = js.Array[Certificate]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DBClusterList = js.Array[DBCluster]
  type DBClusterMemberList = js.Array[DBClusterMember]
  type DBClusterParameterGroupList = js.Array[DBClusterParameterGroup]
  type DBClusterRoles = js.Array[DBClusterRole]
  type DBClusterSnapshotAttributeList = js.Array[DBClusterSnapshotAttribute]
  type DBClusterSnapshotList = js.Array[DBClusterSnapshot]
  type DBEngineVersionList = js.Array[DBEngineVersion]
  type DBInstanceList = js.Array[DBInstance]
  type DBInstanceStatusInfoList = js.Array[DBInstanceStatusInfo]
  type DBSubnetGroups = js.Array[DBSubnetGroup]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventList = js.Array[Event]
  type FilterList = js.Array[Filter]
  type FilterValueList = js.Array[String]
  type Integer = Double
  type IntegerOptional = Double
  type KeyList = js.Array[String]
  type LogTypeList = js.Array[String]
  type OrderableDBInstanceOptionsList = js.Array[OrderableDBInstanceOption]
  type ParametersList = js.Array[Parameter]
  type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[ResourcePendingMaintenanceActions]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`db-instance`
    - typings.awsDashSdk.awsDashSdkStrings.`db-parameter-group`
    - typings.awsDashSdk.awsDashSdkStrings.`db-security-group`
    - typings.awsDashSdk.awsDashSdkStrings.`db-snapshot`
    - typings.awsDashSdk.awsDashSdkStrings.`db-cluster`
    - typings.awsDashSdk.awsDashSdkStrings.`db-cluster-snapshot`
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = Date
  type TagList = js.Array[Tag]
  type ValidUpgradeTargetList = js.Array[UpgradeTarget]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-10-31`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
