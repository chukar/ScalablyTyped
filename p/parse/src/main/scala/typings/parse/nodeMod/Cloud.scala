package typings.parse.nodeMod

import org.scalablytyped.runtime.Instantiable0
import typings.parse.parseMod._Global_.Parse.Attributes
import typings.parse.parseMod._Global_.Parse.Cloud.AfterDeleteRequest
import typings.parse.parseMod._Global_.Parse.Cloud.AfterFindRequest
import typings.parse.parseMod._Global_.Parse.Cloud.AfterSaveRequest
import typings.parse.parseMod._Global_.Parse.Cloud.BeforeDeleteRequest
import typings.parse.parseMod._Global_.Parse.Cloud.BeforeFindRequest
import typings.parse.parseMod._Global_.Parse.Cloud.BeforeSaveRequest
import typings.parse.parseMod._Global_.Parse.Cloud.FunctionRequest
import typings.parse.parseMod._Global_.Parse.Cloud.HTTPOptions
import typings.parse.parseMod._Global_.Parse.Cloud.HttpResponse
import typings.parse.parseMod._Global_.Parse.Cloud.JobRequest
import typings.parse.parseMod._Global_.Parse.Cloud.RunOptions
import typings.parse.parseMod._Global_.Parse.Cloud.TriggerRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains functions for calling and declaring
  * <a href="/docs/cloud_code_guide#functions">cloud functions</a>.
  * <p><strong><em>
  *   Some functions are only available from Cloud Code.
  * </em></strong></p>
  */
@JSImport("parse/node", "Cloud")
@js.native
object Cloud extends js.Object {
  /**
    * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
    *
    *     import Buffer = require("buffer").Buffer;
    */
  var HTTPOptions: Instantiable0[typings.parse.parseMod._Global_.Parse.Cloud.HTTPOptions] = js.native
  def afterDelete(arg1: js.Any): Unit = js.native
  def afterDelete(arg1: js.Any, func: js.Function1[/* request */ AfterDeleteRequest, js.Promise[Unit] | Unit]): Unit = js.native
  def afterFind(arg1: js.Any): Unit = js.native
  def afterFind(arg1: js.Any, func: js.Function1[/* request */ AfterFindRequest, _]): Unit = js.native
  def afterSave(arg1: js.Any): Unit = js.native
  def afterSave(arg1: js.Any, func: js.Function1[/* request */ AfterSaveRequest, js.Promise[Unit] | Unit]): Unit = js.native
  def beforeDelete(arg1: js.Any): Unit = js.native
  def beforeDelete(arg1: js.Any, func: js.Function1[/* request */ BeforeDeleteRequest, js.Promise[Unit] | Unit]): Unit = js.native
  def beforeFind(arg1: js.Any): Unit = js.native
  def beforeFind(
    arg1: js.Any,
    func: js.Function1[
      /* request */ BeforeFindRequest, 
      (js.Promise[
        typings.parse.parseMod._Global_.Parse.Query[typings.parse.parseMod._Global_.Parse.Object[Attributes]] | Unit
      ]) | typings.parse.parseMod._Global_.Parse.Query[typings.parse.parseMod._Global_.Parse.Object[Attributes]] | Unit
    ]
  ): Unit = js.native
  def beforeLogin(): Unit = js.native
  def beforeLogin(func: js.Function1[/* request */ TriggerRequest, _]): Unit = js.native
  def beforeSave(arg1: js.Any): Unit = js.native
  def beforeSave(arg1: js.Any, func: js.Function1[/* request */ BeforeSaveRequest, js.Promise[Unit] | Unit]): Unit = js.native
  def define(name: String): Unit = js.native
  def define(name: String, func: js.Function1[/* request */ FunctionRequest, _]): Unit = js.native
  /**
    * Gets job status by Id
    * @param jobStatusId The Id of Job Status.
    * @returns Status of Job.
    */
  def getJobStatus(jobStatusId: String): js.Promise[typings.parse.parseMod._Global_.Parse.Object[Attributes]] = js.native
  /**
    * Gets data for the current set of cloud jobs.
    * @returns A promise that will be resolved with the result of the function.
    */
  def getJobsData(): js.Promise[typings.parse.parseMod._Global_.Parse.Object[Attributes]] = js.native
  def httpRequest(options: HTTPOptions): js.Promise[HttpResponse] = js.native
  def job(name: String): HttpResponse = js.native
  def job(name: String, func: js.Function1[/* request */ JobRequest, js.Promise[Unit] | Unit]): HttpResponse = js.native
  def run(name: String): js.Promise[_] = js.native
  def run(name: String, data: js.Any): js.Promise[_] = js.native
  def run(name: String, data: js.Any, options: RunOptions): js.Promise[_] = js.native
  /**
    * Starts a given cloud job, which will process asynchronously.
    * @param jobName The function name.
    * @param data The parameters to send to the cloud function.
    * @returns A promise that will be resolved with the jobStatusId of the job.
    */
  def startJob(jobName: String, data: js.Any): js.Promise[String] = js.native
  def useMasterKey(): Unit = js.native
  // Read preference describes how MongoDB driver route read operations to the members of a replica set.
  @js.native
  object ReadPreferenceOption extends js.Object {
    /* "NEAREST" */ val Nearest: typings.parse.parseMod._Global_.Parse.Cloud.ReadPreferenceOption.Nearest with String = js.native
    /* "PRIMARY" */ val Primary: typings.parse.parseMod._Global_.Parse.Cloud.ReadPreferenceOption.Primary with String = js.native
    /* "PRIMARY_PREFERRED" */ val PrimaryPreferred: typings.parse.parseMod._Global_.Parse.Cloud.ReadPreferenceOption.PrimaryPreferred with String = js.native
    /* "SECONDARY" */ val Secondary: typings.parse.parseMod._Global_.Parse.Cloud.ReadPreferenceOption.Secondary with String = js.native
    /* "SECONDARY_PREFERRED" */ val SecondaryPreferred: typings.parse.parseMod._Global_.Parse.Cloud.ReadPreferenceOption.SecondaryPreferred with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.parse.parseMod._Global_.Parse.Cloud.ReadPreferenceOption with String] = js.native
  }
  
}

