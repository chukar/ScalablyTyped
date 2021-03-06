package typings.yadda.libInterpreterMod

import typings.std.Error
import typings.yadda.libMod.Scenario
import typings.yadda.libMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interpreter extends js.Object {
  def interpret(scenario: js.Array[Scenario], scenario_context: typings.yadda.libContextMod.^): Unit = js.native
  def interpret(
    scenario: js.Array[Scenario],
    scenario_context: typings.yadda.libContextMod.^,
    next: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[Scenario], Unit]
  ): Unit = js.native
  def interpret(scenario: Scenario, scenario_context: typings.yadda.libContextMod.^): Unit = js.native
  def interpret(
    scenario: Scenario,
    scenario_context: typings.yadda.libContextMod.^,
    next: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[Scenario], Unit]
  ): Unit = js.native
  def interpret_step(step: js.Array[Step], scenario_context: typings.yadda.libContextMod.^): Unit = js.native
  def interpret_step(
    step: js.Array[Step],
    scenario_context: typings.yadda.libContextMod.^,
    next: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[Step], Unit]
  ): Unit = js.native
  def interpret_step(step: Step, scenario_context: typings.yadda.libContextMod.^): Unit = js.native
  def interpret_step(
    step: Step,
    scenario_context: typings.yadda.libContextMod.^,
    next: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[Step], Unit]
  ): Unit = js.native
  def requires(libs: js.Array[typings.yadda.libLibraryMod.^]): this.type = js.native
  def requires(libs: typings.yadda.libLibraryMod.^): this.type = js.native
  def validate(scenario: Scenario): Unit = js.native
}

