import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'Multiplier',
})
export class MultiplierPipe implements PipeTransform {
  transform(value: number, ...args: string[]): unknown {
    let mult = parseFloat(args[0]);
    return mult * value;
  }
}