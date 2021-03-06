package typings.nodegit.nodegitMod

import typings.nodegit.rebaseMod.RebaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Rebase")
@js.native
class Rebase ()
  extends typings.nodegit.rebaseMod.Rebase

/* static members */
@JSImport("nodegit", "Rebase")
@js.native
object Rebase extends js.Object {
  def init(
    repo: typings.nodegit.repositoryMod.Repository,
    branch: typings.nodegit.annotatedDashCommitMod.AnnotatedCommit,
    upstream: typings.nodegit.annotatedDashCommitMod.AnnotatedCommit,
    onto: typings.nodegit.annotatedDashCommitMod.AnnotatedCommit
  ): js.Promise[typings.nodegit.rebaseMod.Rebase] = js.native
  def init(
    repo: typings.nodegit.repositoryMod.Repository,
    branch: typings.nodegit.annotatedDashCommitMod.AnnotatedCommit,
    upstream: typings.nodegit.annotatedDashCommitMod.AnnotatedCommit,
    onto: typings.nodegit.annotatedDashCommitMod.AnnotatedCommit,
    opts: RebaseOptions
  ): js.Promise[typings.nodegit.rebaseMod.Rebase] = js.native
  def initOptions(opts: RebaseOptions, version: Double): Double = js.native
  def open(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.rebaseMod.Rebase] = js.native
  def open(repo: typings.nodegit.repositoryMod.Repository, opts: RebaseOptions): js.Promise[typings.nodegit.rebaseMod.Rebase] = js.native
}

