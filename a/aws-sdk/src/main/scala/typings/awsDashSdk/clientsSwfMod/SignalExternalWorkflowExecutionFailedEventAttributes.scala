package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalExternalWorkflowExecutionFailedEventAttributes extends js.Object {
  /**
    * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
    */
  var cause: SignalExternalWorkflowExecutionFailedCause = js.native
  /**
    * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the workflow execution.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the SignalExternalWorkflowExecution decision for this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The ID of the SignalExternalWorkflowExecutionInitiated event corresponding to the SignalExternalWorkflowExecution decision to request this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId = js.native
  /**
    * The runId of the external workflow execution that the signal was being delivered to.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    * The workflowId of the external workflow execution that the signal was being delivered to.
    */
  var workflowId: WorkflowId = js.native
}

object SignalExternalWorkflowExecutionFailedEventAttributes {
  @scala.inline
  def apply(
    cause: SignalExternalWorkflowExecutionFailedCause,
    decisionTaskCompletedEventId: EventId,
    initiatedEventId: EventId,
    workflowId: WorkflowId,
    control: Data = null,
    runId: WorkflowRunIdOptional = null
  ): SignalExternalWorkflowExecutionFailedEventAttributes = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], initiatedEventId = initiatedEventId.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (runId != null) __obj.updateDynamic("runId")(runId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalExternalWorkflowExecutionFailedEventAttributes]
  }
}

