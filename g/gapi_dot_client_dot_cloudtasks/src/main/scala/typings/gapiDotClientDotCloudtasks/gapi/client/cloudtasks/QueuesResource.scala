package typings.gapiDotClientDotCloudtasks.gapi.client.cloudtasks

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudtasks.Anon_Accesstoken
import typings.gapiDotClientDotCloudtasks.Anon_AccesstokenAlt
import typings.gapiDotClientDotCloudtasks.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotCloudtasks.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
import typings.gapiDotClientDotCloudtasks.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuesResource extends js.Object {
  var tasks: TasksResource
  /**
    * Creates a queue.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def create(request: Anon_AccesstokenAlt): Request[Queue]
  /**
    * Deletes a queue.
    *
    * This command will delete the queue even if it has tasks in it.
    *
    * Note: If you delete a queue, a queue with the same name can't be created
    * for 7 days.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def delete(request: Anon_Accesstoken): Request[js.Object]
  /** Gets a queue. */
  def get(request: Anon_Accesstoken): Request[Queue]
  /**
    * Gets the access control policy for a Queue.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    *
    * Authorization requires the following [Google IAM](/iam) permission on the
    * specified resource parent:
    *
    * &#42; `cloudtasks.queues.getIamPolicy`
    */
  def getIamPolicy(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Policy]
  /**
    * Lists queues.
    *
    * Queues are returned in lexicographical order.
    */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsFilter): Request[ListQueuesResponse]
  /**
    * Updates a queue.
    *
    * This method creates the queue if it does not exist and updates
    * the queue if it does exist.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[Queue]
  /**
    * Pauses the queue.
    *
    * If a queue is paused then the system will stop executing the
    * tasks in the queue until it is resumed via
    * CloudTasks.ResumeQueue. Tasks can still be added when the
    * queue is paused. The state of the queue is stored in
    * Queue.queue_state; if paused it will be set to
    * Queue.QueueState.PAUSED.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def pause(request: Anon_Accesstoken): Request[Queue]
  /**
    * Purges a queue by deleting all of its tasks.
    *
    * All tasks created before this method is called are permanently deleted.
    *
    * Purge operations can take up to one minute to take effect. Tasks
    * might be dispatched before the purge takes effect. A purge is irreversible.
    */
  def purge(request: Anon_Accesstoken): Request[Queue]
  /**
    * Resume a queue.
    *
    * This method resumes a queue after it has been
    * Queue.QueueState.PAUSED or Queue.QueueState.DISABLED. The state of
    * a queue is stored in Queue.queue_state; after calling this method it
    * will be set to Queue.QueueState.RUNNING.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    *
    * WARNING: Resuming many high-QPS queues at the same time can
    * lead to target overloading. If you are resuming high-QPS
    * queues, follow the 500/50/5 pattern described in
    * [Managing Cloud Tasks Scaling Risks](/cloud-tasks/pdfs/managing-cloud-tasks-scaling-risks-2017-06-05.pdf).
    */
  def resume(request: Anon_Accesstoken): Request[Queue]
  /**
    * Sets the access control policy for a Queue. Replaces any existing
    * policy.
    *
    * Authorization requires the following [Google IAM](/iam) permission on the
    * specified resource parent:
    *
    * &#42; `cloudtasks.queues.setIamPolicy`
    */
  def setIamPolicy(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Policy]
  /**
    * Returns permissions that a caller has on a Queue.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a google.rpc.Code.NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[TestIamPermissionsResponse]
}

object QueuesResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAlt => Request[Queue],
    delete: Anon_Accesstoken => Request[js.Object],
    get: Anon_Accesstoken => Request[Queue],
    getIamPolicy: Anon_AccesstokenAltBearertokenCallbackFields => Request[Policy],
    list: Anon_AccesstokenAltBearertokenCallbackFieldsFilter => Request[ListQueuesResponse],
    patch: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[Queue],
    pause: Anon_Accesstoken => Request[Queue],
    purge: Anon_Accesstoken => Request[Queue],
    resume: Anon_Accesstoken => Request[Queue],
    setIamPolicy: Anon_AccesstokenAltBearertokenCallbackFields => Request[Policy],
    tasks: TasksResource,
    testIamPermissions: Anon_AccesstokenAltBearertokenCallbackFields => Request[TestIamPermissionsResponse]
  ): QueuesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), pause = js.Any.fromFunction1(pause), purge = js.Any.fromFunction1(purge), resume = js.Any.fromFunction1(resume), setIamPolicy = js.Any.fromFunction1(setIamPolicy), tasks = tasks.asInstanceOf[js.Any], testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[QueuesResource]
  }
}

