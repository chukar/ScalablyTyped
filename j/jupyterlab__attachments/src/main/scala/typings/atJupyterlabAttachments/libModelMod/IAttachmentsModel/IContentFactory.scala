package typings.atJupyterlabAttachments.libModelMod.IAttachmentsModel

import typings.atJupyterlabRendermime.libAttachmentmodelMod.IAttachmentModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an attachment content factory.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an attachment model.
    */
  def createAttachmentModel(options: typings.atJupyterlabRendermime.libAttachmentmodelMod.IAttachmentModel.IOptions): IAttachmentModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createAttachmentModel: typings.atJupyterlabRendermime.libAttachmentmodelMod.IAttachmentModel.IOptions => IAttachmentModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createAttachmentModel = js.Any.fromFunction1(createAttachmentModel))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

