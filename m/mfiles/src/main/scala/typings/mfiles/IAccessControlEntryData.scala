package typings.mfiles

import typings.mfiles.MFiles.MFPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryData extends js.Object {
  var AttachObjectsPermission: MFPermission
  var ChangePermissionsPermission: MFPermission
  var DeletePermission: MFPermission
  var EditPermission: MFPermission
  var ReadPermission: MFPermission
  def Clone(): IAccessControlEntryData
  def SetAllPermissions(Permission: MFPermission): Unit
}

object IAccessControlEntryData {
  @scala.inline
  def apply(
    AttachObjectsPermission: MFPermission,
    ChangePermissionsPermission: MFPermission,
    Clone: () => IAccessControlEntryData,
    DeletePermission: MFPermission,
    EditPermission: MFPermission,
    ReadPermission: MFPermission,
    SetAllPermissions: MFPermission => Unit
  ): IAccessControlEntryData = {
    val __obj = js.Dynamic.literal(AttachObjectsPermission = AttachObjectsPermission.asInstanceOf[js.Any], ChangePermissionsPermission = ChangePermissionsPermission.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), DeletePermission = DeletePermission.asInstanceOf[js.Any], EditPermission = EditPermission.asInstanceOf[js.Any], ReadPermission = ReadPermission.asInstanceOf[js.Any], SetAllPermissions = js.Any.fromFunction1(SetAllPermissions))
  
    __obj.asInstanceOf[IAccessControlEntryData]
  }
}

