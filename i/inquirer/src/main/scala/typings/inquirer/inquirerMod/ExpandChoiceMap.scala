package typings.inquirer.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for the `ExpandQuestion`.
  *
  * @template T
  * The type of the answers.
  */
trait ExpandChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var ExpandChoiceOptions: typings.inquirer.inquirerMod.ExpandChoiceOptions[T]
}

object ExpandChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    Choice: typings.inquirer.libObjectsChoiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    ExpandChoiceOptions: ExpandChoiceOptions[T],
    Separator: typings.inquirer.libObjectsSeparatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): ExpandChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], ExpandChoiceOptions = ExpandChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpandChoiceMap[T]]
  }
}

