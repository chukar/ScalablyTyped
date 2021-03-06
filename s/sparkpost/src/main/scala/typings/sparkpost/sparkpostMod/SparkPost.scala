package typings.sparkpost.sparkpostMod

import typings.request.requestMod.Options
import typings.sparkpost.Anon_Callback
import typings.sparkpost.Anon_CallbackCreate
import typings.sparkpost.Anon_CallbackCreateDelete
import typings.sparkpost.Anon_CallbackCreateDeleteDomain
import typings.sparkpost.Anon_CallbackCreateDeleteGet
import typings.sparkpost.Anon_CallbackCreateDeleteGetGetBatchStatus
import typings.sparkpost.Anon_CallbackCreateGet
import typings.sparkpost.Anon_CallbackDelete
import typings.sparkpost.Anon_CallbackGet
import typings.sparkpost.Anon_CallbackParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkPost extends js.Object {
  /** Specifying an inbound domain enables you to customize the address to which inbound messages are sent. */
  var inboundDomains: Anon_Callback = js.native
  /** The Message Events API provides the means to search the raw events generated by SparkPost. */
  var messageEvents: Anon_CallbackParameters = js.native
  /** A recipient list is a collection of recipients that can be used in a transmission. */
  var recipientLists: Anon_CallbackCreate = js.native
  /** Relay Webhooks are a way to instruct SparkPost to accept inbound email on your behalf and forward it to you over HTTP for your own consumption. */
  var relayWebhooks: Anon_CallbackCreateDelete = js.native
  var sendingDomains: Anon_CallbackCreateDeleteDomain = js.native
  var subaccounts: Anon_CallbackCreateGet = js.native
  var suppressionList: Anon_CallbackDelete = js.native
  var templates: Anon_CallbackCreateDeleteGet = js.native
  var transmissions: Anon_CallbackGet = js.native
  var webhooks: Anon_CallbackCreateDeleteGetGetBatchStatus = js.native
  def delete(options: Options): js.Promise[Response[_]] = js.native
  def delete(options: Options, callback: Callback[_]): Unit = js.native
  def get(options: Options): js.Promise[Response[_]] = js.native
  def get(options: Options, callback: Callback[_]): Unit = js.native
  def post(options: Options): js.Promise[Response[_]] = js.native
  def post(options: Options, callback: Callback[_]): Unit = js.native
  def put(options: Options): js.Promise[Response[_]] = js.native
  def put(options: Options, callback: Callback[_]): Unit = js.native
  def request(options: Options): js.Promise[Response[_]] = js.native
  def request(options: Options, callback: Callback[_]): Unit = js.native
}

