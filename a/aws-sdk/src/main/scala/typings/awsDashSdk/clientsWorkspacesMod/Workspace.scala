package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workspace extends js.Object {
  /**
    * The identifier of the bundle used to create the WorkSpace.
    */
  var BundleId: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.BundleId] = js.native
  /**
    * The name of the WorkSpace, as seen by the operating system.
    */
  var ComputerName: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.ComputerName] = js.native
  /**
    * The identifier of the AWS Directory Service directory for the WorkSpace.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.DirectoryId] = js.native
  /**
    * The error code that is returned if the WorkSpace cannot be created.
    */
  var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.native
  /**
    * The text of the error message that is returned if the WorkSpace cannot be created.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  /**
    * The IP address of the WorkSpace.
    */
  var IpAddress: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.IpAddress] = js.native
  /**
    * The modification states of the WorkSpace.
    */
  var ModificationStates: js.UndefOr[ModificationStateList] = js.native
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The operational state of the WorkSpace.
    */
  var State: js.UndefOr[WorkspaceState] = js.native
  /**
    * The identifier of the subnet for the WorkSpace.
    */
  var SubnetId: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.SubnetId] = js.native
  /**
    * The user for the WorkSpace.
    */
  var UserName: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.UserName] = js.native
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The KMS key used to encrypt data stored on your WorkSpace.
    */
  var VolumeEncryptionKey: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.VolumeEncryptionKey] = js.native
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.WorkspaceId] = js.native
  /**
    * The properties of the WorkSpace.
    */
  var WorkspaceProperties: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.WorkspaceProperties] = js.native
}

object Workspace {
  @scala.inline
  def apply(
    BundleId: BundleId = null,
    ComputerName: ComputerName = null,
    DirectoryId: DirectoryId = null,
    ErrorCode: WorkspaceErrorCode = null,
    ErrorMessage: Description = null,
    IpAddress: IpAddress = null,
    ModificationStates: ModificationStateList = null,
    RootVolumeEncryptionEnabled: js.UndefOr[Boolean] = js.undefined,
    State: WorkspaceState = null,
    SubnetId: SubnetId = null,
    UserName: UserName = null,
    UserVolumeEncryptionEnabled: js.UndefOr[Boolean] = js.undefined,
    VolumeEncryptionKey: VolumeEncryptionKey = null,
    WorkspaceId: WorkspaceId = null,
    WorkspaceProperties: WorkspaceProperties = null
  ): Workspace = {
    val __obj = js.Dynamic.literal()
    if (BundleId != null) __obj.updateDynamic("BundleId")(BundleId.asInstanceOf[js.Any])
    if (ComputerName != null) __obj.updateDynamic("ComputerName")(ComputerName.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (ModificationStates != null) __obj.updateDynamic("ModificationStates")(ModificationStates.asInstanceOf[js.Any])
    if (!js.isUndefined(RootVolumeEncryptionEnabled)) __obj.updateDynamic("RootVolumeEncryptionEnabled")(RootVolumeEncryptionEnabled.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    if (!js.isUndefined(UserVolumeEncryptionEnabled)) __obj.updateDynamic("UserVolumeEncryptionEnabled")(UserVolumeEncryptionEnabled.asInstanceOf[js.Any])
    if (VolumeEncryptionKey != null) __obj.updateDynamic("VolumeEncryptionKey")(VolumeEncryptionKey.asInstanceOf[js.Any])
    if (WorkspaceId != null) __obj.updateDynamic("WorkspaceId")(WorkspaceId.asInstanceOf[js.Any])
    if (WorkspaceProperties != null) __obj.updateDynamic("WorkspaceProperties")(WorkspaceProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workspace]
  }
}

