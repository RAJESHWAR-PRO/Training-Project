import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Skill } from '../models/skill.model';
import { SkillService } from './skill.service';

@Component({
  templateUrl: './add-skill.component.html'
})
export class AddSkillComponent {

  skill: Skill = new Skill();

  constructor(private router: Router, private skillService: SkillService) {

  }

  createSkill(): void {
    this.skillService.createUser(this.skill)
        .subscribe( data => {
          alert("Skill record created successfully.");
        });

  };

}
