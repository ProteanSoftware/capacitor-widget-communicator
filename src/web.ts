import { WebPlugin } from '@capacitor/core';
import { WidgetCommunicatorPlugin } from './definitions';

export class WidgetCommunicatorWeb extends WebPlugin implements WidgetCommunicatorPlugin {
  constructor() {
    super({
      name: 'WidgetCommunicator',
      platforms: ['web'],
    });
  }

  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

const WidgetCommunicator = new WidgetCommunicatorWeb();

export { WidgetCommunicator };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(WidgetCommunicator);
