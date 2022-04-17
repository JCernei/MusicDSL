import librosa
import encode
import pygame
import numpy as np

class NotePlayer:
    def __init__(self) -> None:
        pygame.mixer.init()
        self.queue = []
        
    def playNote(self, note):
        tone = self.generateNote(note)
        soundObj = pygame.sndarray.make_sound(encode.as_int16(tone))
        length = soundObj.get_length()
        soundObj.play()
        pygame.time.wait(int(length * 1000))
        
    # def enqueue(self, note):
    #     tone = self.generateNote(note)
    #     soundObj = pygame.sndarray.make_sound(encode.as_int16(tone))
    #     self.queue.append(soundObj)

    # def play        

    def generateNote(self, note):
        note = 440*2**((note-69)/12)
        tone = librosa.tone(note, duration=1)
        tone = librosa.effects.preemphasis(tone)
        tone = np.repeat(tone.reshape(len(tone), 1), 2, axis = 1)
        return tone
    
    def exit(self):
        pygame.mixer.quit()

if  __name__ == '__main__':
    player = NotePlayer()
    player.playNote(50)
               
