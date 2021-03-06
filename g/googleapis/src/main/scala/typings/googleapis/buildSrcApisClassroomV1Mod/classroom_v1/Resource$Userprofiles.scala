package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Userprofiles")
@js.native
class Resource$Userprofiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var guardianInvitations: ResourceDollarUserprofilesDollarGuardianinvitations = js.native
  var guardians: ResourceDollarUserprofilesDollarGuardians = js.native
  /**
    * classroom.userProfiles.get
    * @desc Returns a user profile.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting user is not permitted to
    * access this user profile, if no profile exists with the requested ID, or
    * for access errors.
    * @alias classroom.userProfiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId Identifier of the profile to return. The identifier can be one of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UserProfile] = js.native
  def get(callback: BodyResponseCallback[Schema$UserProfile]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserprofilesDollarGet): GaxiosPromise[Schema$UserProfile] = js.native
  def get(
    params: ParamsDollarResourceDollarUserprofilesDollarGet,
    callback: BodyResponseCallback[Schema$UserProfile]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUserprofilesDollarGet,
    options: BodyResponseCallback[Schema$UserProfile],
    callback: BodyResponseCallback[Schema$UserProfile]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserprofilesDollarGet, options: MethodOptions): GaxiosPromise[Schema$UserProfile] = js.native
  def get(
    params: ParamsDollarResourceDollarUserprofilesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserProfile]
  ): Unit = js.native
}

