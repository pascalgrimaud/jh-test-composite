import { NgModule } from '@angular/core';
import { SharedLibsModule } from './shared-libs.module';
import { AlertComponent } from './alert/alert.component';
import { AlertErrorComponent } from './alert/alert-error.component';
import { HasAnyAuthorityDirective } from './has-any-authority.directive';
import { DurationPipe } from './duration.pipe';

@NgModule({
  imports: [SharedLibsModule],
  declarations: [AlertComponent, AlertErrorComponent, HasAnyAuthorityDirective, DurationPipe],
  exports: [SharedLibsModule, AlertComponent, AlertErrorComponent, HasAnyAuthorityDirective, DurationPipe],
})
export class SharedModule {}
